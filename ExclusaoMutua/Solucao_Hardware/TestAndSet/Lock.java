package Solucao_Hardware.TestAndSet;

public interface Lock {
    public void requestCS(int id);
    public void releaseCS(int id);
}
