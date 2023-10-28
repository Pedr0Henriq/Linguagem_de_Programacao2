package LP2.Semaforos.Produtor_Consumidor.Buffer_Circular;

import java.util.concurrent.Semaphore;

public class BoundedBuffer {
Semaphore empty, full;
int size, inBuf, outBuf;
String[] buffer;
public BoundedBuffer(int n) {
size = n;
empty = new Semaphore(size);
full = new Semaphore(0);
inBuf = 0;
outBuf = 0;
buffer = new String[size];
for (int i=0; i < size; i++)
    buffer[i] = null;
}
public void deposit(String v) throws Exception{
    empty.acquire();
    buffer[inBuf] = v;
    inBuf = (inBuf + 1) % size;
    full.release();
    }
    
public String fetch() throws Exception{String v;
    full.acquire();
    v = buffer[outBuf];
    outBuf = (outBuf + 1) % size;
    empty.release();
    return v;
    }
    }

