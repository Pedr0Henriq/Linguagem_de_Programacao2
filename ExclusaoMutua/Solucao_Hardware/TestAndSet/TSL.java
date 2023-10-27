package Solucao_Hardware.TestAndSet;

public class TSL {
    boolean locked = false;
public boolean testAndSet() {
boolean temp = locked;
if (! locked) locked = true;
return temp;
}
public void unlock() {
locked = false;
}
}
