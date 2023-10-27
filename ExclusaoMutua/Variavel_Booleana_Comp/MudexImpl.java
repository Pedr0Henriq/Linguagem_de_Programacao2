package Variavel_Booleana_Comp;
public class MudexImpl implements Mudex {
boolean ocupado = false;
public void requestCS() {
while (ocupado);
ocupado = true;
}
public void releaseCS() {
ocupado = false;
}
}