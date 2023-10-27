package Sockets.SemThreads;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class Servidor {
    public static void main(String[] args) throws IOException, UnknownHostException{
        ServerSocket serverSocket= new ServerSocket(54321);
        System.out.println("A porta 54321 foi aberta");
        System.out.println("Servidor esperando receber msg do cliente");
        Socket socket= serverSocket.accept();
        System.out.println("Cliente: "+ socket.getInetAddress().getHostAddress()+ " conectado");

        DataInputStream ent= new DataInputStream(socket.getInputStream());
        String msg= ent.readUTF();
        String newMsg= msg.toUpperCase();
        DataOutputStream exit= new DataOutputStream(socket.getOutputStream());
        exit.writeUTF(newMsg);
        ent.close();
        exit.close();
        socket.close();
        serverSocket.close();

    }
}
