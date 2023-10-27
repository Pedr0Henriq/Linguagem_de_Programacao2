package Variavel_Selecao_Comp;

public class LockImpl implements Lock{
    private int vez=0;
    @Override
    public void releaseCS(int id) {
        vez=1-id;
    }

    @Override
    public void requestCS(int id) {
        
        while(vez==1-id);
    }
    
}
