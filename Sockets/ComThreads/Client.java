package Sockets.ComThreads;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class Client {
    public static void main(String[] args) throws IOException, UnknownHostException {
        Socket socket= new Socket("localhost",4444);
        DataOutputStream exit= new DataOutputStream(socket.getOutputStream());
        exit.writeUTF("pedro");
        DataInputStream ent= new DataInputStream(socket.getInputStream());
        String newMSG= ent.readUTF();
        System.out.println(newMSG);
        ent.close();
        exit.close();
        socket.close();
    }
}
