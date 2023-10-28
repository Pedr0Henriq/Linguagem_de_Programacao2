package RMI;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
public static void main(String[] args) throws Exception{
ServerSocket s = new ServerSocket(8888);
while (true) {
Socket ns = s.accept();
DataInputStream in = new DataInputStream(ns.getInputStream());DataOutputStream out = new DataOutputStream(ns.getOutputStream());String cmd = in.readUTF();
out.writeUTF((cmd).toUpperCase());
in.close();
out.close();
ns.close();
}
}
}
