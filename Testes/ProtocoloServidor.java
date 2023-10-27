package Testes;

import java.net.*;
import java.io.*;
public class ProtocoloServidor{
    public static void main(String[] args) throws IOException, UnknownHostException, ClassNotFoundException{
        try (ServerSocket s = new ServerSocket(44444)) {
            while(true){
                Socket ns= s.accept();
                ThreadS t= new ThreadS(ns);
                t.start();
            }
           
        }
    }
}