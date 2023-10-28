package Monitores.Problema_Produtor_Consumidor.Mensagem_Unica;

public class ProducerConsumer {
    public static void main(String[] args) {SingleBuffer buffer= new SingleBuffer();
    String message= "Hello COnsumidor";
    Consumer c= new Consumer(buffer);
    Producer p= new Producer(buffer, message);
    p.start();
    c.start();} 
}
