package LP2.Semaforos.Produtor_Consumidor.Buffer_Circular;

public class Consumer extends Thread {
BoundedBuffer buffer;
String value;
public Consumer(BoundedBuffer b) {
buffer = b;
}
public void run() {
while (true){
    try{
    value = buffer.fetch();
System.out.println("Consumidor encontrou a seguinte mensagem: "+value);}
    catch(Exception e){
    System.out.println(e);}}}
}
