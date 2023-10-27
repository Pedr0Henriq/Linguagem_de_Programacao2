package Duas_V_Booleana_Comp;

public interface Lock {
    public void releaseCS(int id);
    public void requestCS(int id);
}
