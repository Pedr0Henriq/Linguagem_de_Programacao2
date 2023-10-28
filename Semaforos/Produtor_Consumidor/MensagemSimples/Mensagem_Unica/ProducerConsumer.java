package LP2.Semaforos.Produtor_Consumidor.MensagemSimples.Mensagem_Unica;



public class ProducerConsumer {
    public static void main (String[] args) {
        String message = "Mensagem de teste";
        SingleBuffer b = new SingleBuffer();
        Producer p = new Producer(b, message);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
        }
}
