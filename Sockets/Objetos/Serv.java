package Sockets.Objetos;
import java.io.*;
import java.net.*;
public class Serv {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
    ServerSocket serverSocket= new ServerSocket(3333);
    System.out.println("A porta 3333 está aberta");
    System.out.println("Servidor esperando receber objeto dos clientes");
    Socket socket = serverSocket.accept();
    System.out.println("Cliente: "+  socket.getInetAddress().getHostAddress()+ " conectado");
    ObjectInputStream entrada= new ObjectInputStream(socket.getInputStream());
    Pessoa p = (Pessoa) entrada.readObject();
    System.out.println("Nome: "+p.getNome()+ "\nIdade: "+ p.getIdade());
    entrada.close();
    socket.close();
    serverSocket.close();
    
    }
    
}
