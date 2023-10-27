package Algoritmo_Bakery;

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
        int qtdProc=10;
        Lock lock = new LockImpl(qtdProc);
        System.out.println("Testando exclusao mutua com Algoritmo de Bakery");
        for(int p = 0;p<qtdProc;p++)
            new MyLock(lock,p).start();
    }
}
