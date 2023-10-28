package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_1Semaforo;

public class Prod extends Thread {
SingBuffer buffer;
String value;
public Prod(SingBuffer b, String v) {
buffer = b;
value = v;
}
public void run() {
int i = 0;
while (true)
    buffer.deposit(value + String.valueOf(i++));}
}
