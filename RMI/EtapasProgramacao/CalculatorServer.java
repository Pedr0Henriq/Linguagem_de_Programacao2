package RMI.EtapasProgramacao;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            CalculatorImpl c = new CalculatorImpl();
            Context ctx = new InitialContext();
            ctx.rebind("rmi://localhost:1099/CalculatorImpl", c);
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
}
