package Algoritmo_Peterson;

public interface Lock {
    public void requestCS(int i);
    public void releaseCS(int i);
}
