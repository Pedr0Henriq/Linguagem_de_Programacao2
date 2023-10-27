//criar threads por meio do extends

package Threads;
public class MinhaThread extends Thread {
    private Thread t= Thread.currentThread();
    public void run(){
        System.out.println(t.getName()+" executando!");
        if(Thread.interrupted()){
            System.out.println(t.getName()+" interrompida!");
        }
    }
}
