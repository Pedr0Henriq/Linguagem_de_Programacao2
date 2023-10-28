package LP2.Semaforos.Produtor_Consumidor.Buffer_Circular;

public class Producer extends Thread {
BoundedBuffer buffer;
String value;
public Producer(BoundedBuffer b, String v) {
buffer = b;
value = v;
}
public void run() {
int i = 0;
while (true){
    try{
    buffer.deposit(value + String.valueOf(i++));}
    catch (Exception e) {System.out.println(e);}}
}}
