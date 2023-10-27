package Threads;
public class Main {
    public static void main(String[] args) {
        //EXECUTANDO POR EXTENDS 
        //EXECUTANDO POR IMPLEMENTS 
        System.out.println("INICIO DA THREAD MAIN!");
        Thread t1= new Thread(new MinhaRunnable(),"thread 1");
        Thread t2= new Thread(new MinhaRunnable(),"thread 2");
        t1.start();
        t2.start();
        t1.interrupt();
    }
}
