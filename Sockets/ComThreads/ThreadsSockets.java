package Sockets.ComThreads;
import java.io.*;
import java.net.*;
public class ThreadsSockets extends Thread{
    private Socket socket;
    public ThreadsSockets(Socket socket){
        this.socket= socket;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{
            DataInputStream ent= new DataInputStream(socket.getInputStream());
            String msg= ent.readUTF();
            String newMSG= msg.toUpperCase();
            DataOutputStream exit= new DataOutputStream(socket.getOutputStream());
            exit.writeUTF(newMSG);
            ent.close();
            exit.close();
            socket.close();
        }
        catch(IOException e){
            System.out.println("Erro: "+ e.toString());
        }
    }
    
}
