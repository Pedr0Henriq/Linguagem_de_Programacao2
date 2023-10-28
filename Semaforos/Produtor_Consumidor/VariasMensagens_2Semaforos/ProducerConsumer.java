package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_2Semaforos;

public class ProducerConsumer {
    public static void main (String[] args) {
        String message = "Hello Consumidor";
        SingleBuffer b = new SingleBuffer();
        Producer p = new Producer(b, message);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
        }
}
