package Variavel_Selecao_Comp;

public class MyLock implements Runnable{
Lock lock;
int id;
public MyLock(Lock lock, int id) {
this.lock = lock;
this.id = id;
}
public void run() {
while (true) {
lock.requestCS(id);
// Seção crítica
System.out.println("Thread "+ id + " is in CS");
lock.releaseCS(id);
System.out.println("Thread "+ id + " is out of CS");
}
}

public static void main(String[] args) {
    LockImpl lock = new LockImpl();
    System.out.println("Testando exclusao mutua com Variavel de Selecao Compartilhada");
    Thread t1= new Thread(new MyLock(lock,0));
    Thread t2= new Thread(new MyLock(lock,1));
    t1.start();
    t2.start();
}
}
