package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_2Semaforos;

public class Consumer extends Thread{
    SingleBuffer buffer;
    String value;
public Consumer(SingleBuffer b) {
buffer = b;
}
public void run() {
while (true)
    try {
        value = buffer.fetch();
        System.out.println("Consumidor retirou a seguinte mensagem: "+value);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
