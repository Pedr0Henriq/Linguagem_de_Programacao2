package RMI;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("server", 8888);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream()); 
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String cmd = stdIn.readLine(); // add op1 op2
        out.writeUTF(cmd);
        System.out.println(in.readUTF());
        in.close();
        out.close();
        s.close();
    }
}