package Variavel_Selecao_Comp;

public interface Lock {
    public void releaseCS(int id);
    public void requestCS(int id);
}
