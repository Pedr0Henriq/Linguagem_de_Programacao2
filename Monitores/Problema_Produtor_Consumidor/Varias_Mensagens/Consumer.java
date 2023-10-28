package Monitores.Problema_Produtor_Consumidor.Varias_Mensagens;

public class Consumer extends Thread {
    SingleBuffr buffer;

    public Consumer(SingleBuffr b){
        buffer=b;
    }
    public void run(){
        while(true) 
            System.out.println("O Consumidor recebeu a seguinte mensagem: "+buffer.fetch());
    }
}
