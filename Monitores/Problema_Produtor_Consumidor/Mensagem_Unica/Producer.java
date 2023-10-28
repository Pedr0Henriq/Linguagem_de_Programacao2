package Monitores.Problema_Produtor_Consumidor.Mensagem_Unica;

public class Producer extends Thread{
    SingleBuffer sb;
    String value;

    public Producer(SingleBuffer sb, String value){
        this.sb = sb;
        this.value = value;
    }

    public void run(){
        sb.deposit(value);
    }
}
