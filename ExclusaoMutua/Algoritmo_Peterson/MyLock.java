package Algoritmo_Peterson;

public class MyLock extends Thread{
    Lock lock;
    int id;
    public MyLock(Lock lock, int id){
        this.lock = lock;
        this.id = id;
    }
    public void run(){
        lock.requestCS(id);
        System.out.println("Thread "+id+" entrou na secao critica");
        lock.releaseCS(id);
        System.out.println("Thread "+id+" saiu da secao critica");
    }
    
    public static void main(String[] args) {
        Lock lock = new LockImpl();
        System.out.println("Testando exclusao mutua com Algoritmo de Peterson");
        MyLock t0 = new MyLock(lock,0);
        MyLock t1 = new MyLock(lock,1);
        t0.start();
        t1.start();
    }
}
