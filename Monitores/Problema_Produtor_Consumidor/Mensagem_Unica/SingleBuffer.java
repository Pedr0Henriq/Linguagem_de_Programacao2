package Monitores.Problema_Produtor_Consumidor.Mensagem_Unica;

public class SingleBuffer {
    String value;
    boolean empty;
    public SingleBuffer(){
        value= null;
        empty = true;
    }
    public synchronized void deposit(String v){
        value=v;
        empty=false;
        notify();
    }
    public synchronized String fetch(){
        while(empty) {try{wait();}catch(InterruptedException e){}}
        return value;
    }
}
