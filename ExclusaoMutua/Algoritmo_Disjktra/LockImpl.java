package Algoritmo_Disjktra;

public class LockImpl implements Lock{
    private volatile int qtdProc, vez;
    private volatile int[] fila;

    public LockImpl(int n){
        qtdProc = n;
        vez = 0;
        fila = new int[n];
        for(int i = 0; i < n; i++){
            fila[i] = 0;
        }
    }
    @Override
    public void requestCS(int i) {
    int j;
    do {
        fila[i] = 1;
        while (vez != i)
            if (fila[vez] == 0) vez = i;
        fila[i] = 2;
        j = 0;
        while ((j < qtdProc) && ((j == i) || (fila[j] != 2)))
            j++; 
    } while (j != qtdProc);
    }

    @Override
    public void releaseCS(int i) {
        fila[i]=0;
    }
    
}
