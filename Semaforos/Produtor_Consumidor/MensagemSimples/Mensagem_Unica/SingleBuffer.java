package LP2.Semaforos.Produtor_Consumidor.MensagemSimples.Mensagem_Unica;

import java.util.concurrent.Semaphore;

public class SingleBuffer {
        Semaphore s;
String value;
public SingleBuffer() {
s = new Semaphore(0);
value = null;
}
public void deposit(String v) {
value = v;
s.release();
}
public String fetch() throws InterruptedException {
s.acquire();
return value;
}
}
