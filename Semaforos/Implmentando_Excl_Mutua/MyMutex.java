package LP2.Semaforos.Implmentando_Excl_Mutua;

import java.util.concurrent.Semaphore;

public class MyMutex extends Thread{
    Semaphore s;
    int id;
    public MyMutex(Semaphore s, int id) {
    this.s = s;
    this.id = id;
    }
    public void run() { 
    while (true) {
    try {
    s.acquire();
    System.out.println("Thread " + id + " entrou na regiao critica");
    s.release();
    System.out.println("Thread " + id + " saiu da regiao critica");
    } catch (InterruptedException e) {
        System.out.println("Thread " + id + " interrompida");
    }}}

    public static void main(String[] args) {
    int qtdProc=10;
    Semaphore s = new Semaphore(1,true);
    System.out.println("Implementando Exclusao Mutua com Semaforos");
    for(int i=0;i<qtdProc;i++)
        new MyMutex(s,i).start();
    }

}
