package Monitores.MetodosSincronizados;

public class SynchImpl extends Thread{
    int id;
    SynchClass sc;
    public SynchImpl(int i, SynchClass s) {
        id = i;
        sc = s;
    }

    public void run() {
        switch (id) {
            case 0:
                sc.synchMethod(id);
                break;
            case 1:
                sc.nonSynchMethod(id);
                break;
            case 2:
                SynchClass.synchStaticMethod(id);
                break;
            case 3:
                SynchClass.nonSynchStaticMethod(id);
                break;  
            default:
                break;
        }
    }

    public static void main(String[] args) {
        SynchClass sc = new SynchClass();
        for (int i = 0; i < 8; i++)
            (new SynchImpl(i, sc)).start();

    }
}
