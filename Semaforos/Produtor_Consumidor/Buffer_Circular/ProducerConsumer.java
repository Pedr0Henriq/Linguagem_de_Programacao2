package LP2.Semaforos.Produtor_Consumidor.Buffer_Circular;

public class ProducerConsumer {
public static void main (String[] args) {
int size = 10;
String message = "Hello World";
BoundedBuffer b = new BoundedBuffer(size);
Producer p = new Producer(b, message);
Consumer c = new Consumer(b);
p.start();
c.start();
}
}