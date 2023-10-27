package Testes;
import java.net.*;
import java.io.*;
public class ThreadS extends Thread{
    private Socket s;
    public ThreadS(Socket s){
        this.s=s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{
            DataInputStream ent= new DataInputStream(s.getInputStream());
            String msg= ent.readUTF();
            DataOutputStream exit= new DataOutputStream(s.getOutputStream());
            exit.writeUTF(msg);
            ent.close();
            exit.close();
            s.close();
        }
        catch(IOException e){
            System.out.println("Erro: "+ e.toString());
        }
    }

    
}
