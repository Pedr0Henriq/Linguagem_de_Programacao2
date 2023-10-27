package Algoritmo_Peterson;

public class LockImpl implements Lock{
    private volatile boolean querCS[] = {false,false};
    private volatile int vez = 1;
    @Override
    public void requestCS(int i) {
        int outroId=1-i;
        querCS[i] = true;
        vez= outroId;
        while(querCS[outroId] && vez==outroId);
    }

    @Override
    public void releaseCS(int i) {
        querCS[i] = false;
    }
    
}
