package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ProtocolServer implements Runnable{
DatagramPacket p;
DatagramSocket s;

public ProtocolServer(DatagramPacket p, DatagramSocket s){ this.s=s; this.p=p;}
public void run(){
    DatagramPacket out;
    String fromClient= new String(p.getData(),0,p.getLength());
    InetAddress clientAddress=p.getAddress();
    int port= p.getPort();
    byte[] outbuf= protocol.processLine(fromClient).getBytes();
    out= new DatagramPacket(outbuf,outbuf.length,clientAddress,port);
    try {
        s.send(out);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

}