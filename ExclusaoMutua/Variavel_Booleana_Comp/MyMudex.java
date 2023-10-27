package Variavel_Booleana_Comp;
public class MyMudex implements Runnable {
    private Mudex lock;
    private String name;
    public MyMudex(Mudex lock, String name) {
    this.lock = lock;
    this.name = name;
    }
    public void run() {
    while (true) {
    lock.requestCS();
    // Seção crítica
    System.out.println(name + " is in CS");
    lock.releaseCS();
    System.out.println(name + " is out of CS");
    }}}
