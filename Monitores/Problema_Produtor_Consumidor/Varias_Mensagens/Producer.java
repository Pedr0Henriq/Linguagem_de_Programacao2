package Monitores.Problema_Produtor_Consumidor.Varias_Mensagens;

public class Producer extends Thread{
    SingleBuffr buffer;
    String value;
    public Producer(SingleBuffr b, String v){
        buffer = b;
        value = v;
    }
    public void run(){
        int i=0;
        while(true){
            buffer.deposit(value+ String.valueOf(i++));
        }
    }
}
