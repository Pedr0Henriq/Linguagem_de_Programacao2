package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_1Semaforo;

public class ProdCons {
public static void main (String[] args) {String message = "Hello Consumidor";
SingBuffer b = new SingBuffer();
Prod p = new Prod(b, message);
Cons c = new Cons(b);
p.start();
c.start();
}
}
