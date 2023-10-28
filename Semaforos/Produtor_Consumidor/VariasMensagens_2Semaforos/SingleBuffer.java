package LP2.Semaforos.Produtor_Consumidor.VariasMensagens_2Semaforos;

import java.util.concurrent.Semaphore;

public class SingleBuffer {
    Semaphore s1, s2;
String value;
public SingleBuffer() {
s1 = new Semaphore(1);
s2 = new Semaphore(0);
value = null;
}

public void deposit(String v) throws InterruptedException {
s1.acquire();
value = v;
s2.release();
}
public String fetch() throws InterruptedException {
String v;
s2.acquire();
v = value;
s1.release();
return v;
}
}
