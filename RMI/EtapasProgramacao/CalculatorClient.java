package RMI.EtapasProgramacao;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Hashtable<String, String> env = new Hashtable<String, String>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
            env.put(Context.PROVIDER_URL, "rmi://localhost:1099");
            Context ctx = new InitialContext(env);
            Calculator c = (Calculator) ctx.lookup("CalculatorService");
            System.out.println("Adição: " + c.add(1, 2));
            System.out.println("Subtração: " + c.sub(1, 2));
            System.out.println("Multiplicação: " + c.mul(1, 2));
            System.out.println("Divisão: " + c.div(1, 2));
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
}
}
