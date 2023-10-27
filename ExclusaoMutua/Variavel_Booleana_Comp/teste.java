package Variavel_Booleana_Comp;
public class teste{
    public static void main(String[] args) {
    MudexImpl lock = new MudexImpl();
    System.out.println("Testando exclusao mutua com Variavel Booleana Compartilhada");
    Thread t1= new Thread(new MyMudex(lock,"Thread 1"));
    Thread t2= new Thread(new MyMudex(lock,"Thread 2"));
    t1.start();
    t2.start();
    }
}