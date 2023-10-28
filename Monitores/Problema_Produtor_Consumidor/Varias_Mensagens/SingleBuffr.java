package Monitores.Problema_Produtor_Consumidor.Varias_Mensagens;

public class SingleBuffr {
    String value;
    boolean empty;
    public SingleBuffr(){
        value= null;
        empty = true;
    }
    public synchronized void deposit(String v){
        while(!empty){
            try{
                wait();
            }catch(InterruptedException e){}
    }
      value= v;
      empty=false;
      notify(); 
}
    public synchronized String fetch(){
        while(empty){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        empty=true;
        notify();
        return value;
    }
}
