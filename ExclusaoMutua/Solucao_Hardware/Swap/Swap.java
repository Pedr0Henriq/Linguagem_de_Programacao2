package Solucao_Hardware.Swap;

public class Swap {
    private boolean value = false;
public boolean swap(boolean newValue) {
boolean temp = value;
value = newValue;
return temp;
}
}
