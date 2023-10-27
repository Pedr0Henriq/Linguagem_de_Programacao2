package Sockets.ComThreads;
import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws IOException, UnknownHostException{
        try (ServerSocket serverSocket = new ServerSocket(4444)) {
            System.out.println("A porta 4444 foi aberta");
            System.out.println("Servidor esperando receber msg dos clientes");
            while(true){
                Socket socket= serverSocket.accept();
                System.out.println("Cliente: "+ socket.getInetAddress().getHostAddress()+ " conectado");
                ThreadsSockets thread= new ThreadsSockets(socket);
                thread.start();
            }
        }
    }
}
