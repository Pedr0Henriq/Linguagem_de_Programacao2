package Sockets.Objetos;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
public class Clien {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Socket socket = new Socket("localhost", 3333);
        ObjectOutputStream saida= new ObjectOutputStream(socket.getOutputStream());
        Pessoa p= new Pessoa("Pedro", 18);
        saida.writeObject(p);
        saida.close();
        socket.close();
    }
}
