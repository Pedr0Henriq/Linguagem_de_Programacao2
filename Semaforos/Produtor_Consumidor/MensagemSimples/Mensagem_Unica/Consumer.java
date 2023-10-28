package LP2.Semaforos.Produtor_Consumidor.MensagemSimples.Mensagem_Unica;


public class Consumer extends Thread{
    SingleBuffer buffer;
String value;
public Consumer(SingleBuffer b) {buffer = b;
}
public void run() {
try {
    value = buffer.fetch();
    System.out.println("Consumidor retirou do buffer a seguinte mensagem: " + value);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}}
}
