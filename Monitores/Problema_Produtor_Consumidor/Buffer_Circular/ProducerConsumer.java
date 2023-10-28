package Monitores.Problema_Produtor_Consumidor.Buffer_Circular;

public class ProducerConsumer {
public static void main(String[] args) {
    int size=10;
    String mensagem= "Hello Consumidor";
    BoundedBuffer buffer = new BoundedBuffer(size);
    Producer p = new Producer(buffer, mensagem);
    Consumer c = new Consumer(buffer);
    p.start();
    c.start();
}
}
