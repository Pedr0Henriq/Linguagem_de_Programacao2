package Sockets.SemThreads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class Cliente {
    public static void main(String[] args) throws IOException, UnknownHostException{
        //Abrir o socket
        Socket socket= new Socket("localhost",54321);
        
        //Enviar mensagem
        DataOutputStream exit= new DataOutputStream(socket.getOutputStream());
        exit.writeUTF("pedro");

        //Receber mensagem
        DataInputStream ent= new DataInputStream(socket.getInputStream());
        String newMsg= ent.readUTF();
        System.out.println(newMsg);
        //Fechar o socket
        ent.close();
        exit.close();

        socket.close();
    }
}
