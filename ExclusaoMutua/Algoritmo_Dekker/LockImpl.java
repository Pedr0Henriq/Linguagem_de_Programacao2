package Algoritmo_Dekker;

public class LockImpl implements Lock{
    private volatile boolean querCS[] = {false,false};
    private volatile int vez = 1;
    @Override
    public void requestCS(int id) {
        int outroId=1-id;
        querCS[id] = true;
        while(querCS[outroId]){
            if(vez==outroId){
                querCS[id] = false;
                while(vez==outroId);
                querCS[id] = true;
            }
        }
    }

    @Override
    public void releaseCS(int id) {
        vez = 1-id;
        querCS[id] = false;
    }
    
}
