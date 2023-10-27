package Algoritmo_Bakery;

public class LockImpl implements Lock {
    private volatile int n;
    private volatile boolean[] escolhendo;
    private volatile int[] numero;

    public LockImpl(int n) {
        this.n = n;
        escolhendo = new boolean[n];
        numero = new int[n];
        for (int i = 0; i < n; i++) {
            escolhendo[i] = false;
            numero[i] = 0;
        }
    }
    @Override
    public void requestCS(int id) {
        escolhendo[id] = true;
        for(int j = 0; j < n; j++) {
            if(numero[j] > numero[id]) numero[id] = numero[j];
        }
        numero[id]++;
        escolhendo[id] = false;
        for(int j = 0; j < n; j++) {
            while(escolhendo[j]);
            while((numero[j] != 0) && (numero[j] < numero[id] || (numero[j] == numero[id] && j < id)));
        }
    }

    @Override
    public void releaseCS(int id) {
        numero[id] = 0;
    }
    
}
