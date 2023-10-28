package LP2.Semaforos.Produtor_Consumidor.MensagemSimples.Mensagem_Unica;



public class Producer extends Thread{
SingleBuffer buffer;
String value;
public Producer(SingleBuffer b, String v) {
this.buffer = b;
this.value = v;
}
public void run() {
buffer.deposit(value);
}
}
