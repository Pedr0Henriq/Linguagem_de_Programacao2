package Solucao_Hardware.TestAndSet;

public class LockImpl implements Lock {
   volatile TSL tsl = new TSL();
    @Override
    public void requestCS(int id) {
        while(tsl.testAndSet());
    }

    @Override
    public void releaseCS(int id) {
        tsl.unlock();
    }
    
}
