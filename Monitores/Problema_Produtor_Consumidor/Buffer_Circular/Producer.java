package Monitores.Problema_Produtor_Consumidor.Buffer_Circular;

public class Producer extends Thread{
    
    BoundedBuffer buffer;
    String value;
    public Producer(BoundedBuffer b, String v){
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
