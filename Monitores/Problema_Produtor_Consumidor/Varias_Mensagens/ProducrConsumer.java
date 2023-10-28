package Monitores.Problema_Produtor_Consumidor.Varias_Mensagens;

public class ProducrConsumer {
    public static void main(String[] args) {
        SingleBuffr buffer= new SingleBuffr();
        String message= "Hello COnsumidor";
        Consumer c= new Consumer(buffer);
        Producer p= new Producer(buffer, message);
        p.start();
        c.start();
    }
}
