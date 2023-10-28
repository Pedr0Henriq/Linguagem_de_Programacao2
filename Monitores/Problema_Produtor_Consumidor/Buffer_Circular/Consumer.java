package Monitores.Problema_Produtor_Consumidor.Buffer_Circular;

public class Consumer extends Thread{
    
    BoundedBuffer buffer;

    public Consumer(BoundedBuffer b){
        buffer=b;
    }
    public void run(){
        while(true) 
            System.out.println("O Consumidor recebeu a seguinte mensagem: "+buffer.fetch());
    }
}
