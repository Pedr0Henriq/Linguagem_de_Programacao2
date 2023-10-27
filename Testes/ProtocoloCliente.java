package Testes;
import java.net.*;
import java.io.*;
public class ProtocoloCliente {
    public static void main(String[] args) throws IOException, UnknownHostException, ClassNotFoundException{
        Socket s= new Socket("localhost", 44444);
        DataOutputStream out= new DataOutputStream(s.getOutputStream());
        DataInputStream in= new DataInputStream(s.getInputStream());
        String nMsg;
        out.writeUTF("Thread "+Thread.currentThread().getName()+" eviou msg");
        nMsg=in.readUTF();
        System.out.println(nMsg);
        in.close();
        out.close();
        s.close();

    }
}
