package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_2Semaforos;

public class Producer extends Thread{
    SingleBuffer buffer;
String value;
public Producer(SingleBuffer b, String v) {
buffer = b;
value = v;
}
public void run() {
int i = 0;
while (true)
    try {
        buffer.deposit(value + String.valueOf(i++));
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
