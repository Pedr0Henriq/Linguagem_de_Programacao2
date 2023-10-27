package Solucao_Hardware.Swap;

public class LockImpl implements Lock{
     Swap s = new Swap();
    @Override
    public void requestCS(int i) {
        while(s.swap(true));
    }

    @Override
    public void releaseCS(int i) {
        s.swap(false);
    }
    
}
