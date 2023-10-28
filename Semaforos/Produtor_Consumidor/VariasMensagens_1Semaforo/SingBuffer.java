package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_1Semaforo;

import java.util.concurrent.Semaphore;

public class SingBuffer {
    Semaphore s;
    String value;
    public SingBuffer() {
    s = new Semaphore(0);
    value = null;
    }
    public void deposit(String v) {
    value = v;
    s.release();
    }
    public String fetch() throws InterruptedException{
    s.acquire();
    return value;
    }
    }