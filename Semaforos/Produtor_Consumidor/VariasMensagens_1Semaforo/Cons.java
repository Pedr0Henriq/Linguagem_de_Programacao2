package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_1Semaforo;

public class Cons extends Thread {
SingBuffer buffer;
String value;
public Cons(SingBuffer b) {
buffer = b;
}
public void run() {
while (true){
    try {
        value = buffer.fetch();
        System.out.println("Consumidor retirou a seguinte mensagem do buffer: "+value);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }} }
}
