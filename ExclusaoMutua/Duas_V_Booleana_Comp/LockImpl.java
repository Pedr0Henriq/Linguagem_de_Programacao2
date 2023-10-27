package Duas_V_Booleana_Comp;

public class LockImpl implements Lock{
    private boolean querCS[] = {false,false};
    @Override
    public void releaseCS(int id) {
        querCS[id] = false;
    }

    @Override
    public void requestCS(int id) {
        querCS[id] = true;
        while(querCS[1-id]);
    }

}
