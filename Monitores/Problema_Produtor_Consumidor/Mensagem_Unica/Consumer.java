package Monitores.Problema_Produtor_Consumidor.Mensagem_Unica;

public class Consumer extends Thread {
    SingleBuffer buffer;
    String value;

    public Consumer(SingleBuffer bf){
        buffer = bf;
    }

    public void run(){
        value=buffer.fetch();
        System.out.println("O Consumidor recebeu a seguinte mensagem: "+value);
    }
}
