package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ThreadedServer{
    public static void main(String[] args) throws IOException{
        DatagramPacket p;
        DatagramSocket s = new DatagramSocket(4444);

        while(true){
            byte[] inbuf= new byte[256];
            p = new DatagramPacket(inbuf, inbuf.length);
            s.receive(p);
            new Thread(new ProtocolServer(p,s)).start();
        }
    }
}