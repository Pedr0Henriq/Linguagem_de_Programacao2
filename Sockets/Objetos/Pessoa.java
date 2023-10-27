package Sockets.Objetos;

public class Pessoa implements java.io.Serializable{
    private String name;
    private int age;
    public Pessoa(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getNome(){
        return this.name;
    }
    public int getIdade(){
        return this.age;
    }
    public void setNome(String name){
        this.name=name;
    }
    public void setIdade(int age){
        this.age=age;
    }
}
