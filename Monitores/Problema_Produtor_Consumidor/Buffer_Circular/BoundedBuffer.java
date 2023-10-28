package Monitores.Problema_Produtor_Consumidor.Buffer_Circular;

public class BoundedBuffer {
    int size,count, inBuf, outBuf;
    String[] buffer;
    public BoundedBuffer(int n){
        size=n;
        count=0;
        inBuf=0;
        outBuf=0;
        buffer= new String[size];
        for (String i : buffer) {
            i=null;
        }
    }
    public synchronized void deposit(String v){
        while(count==size){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        buffer[inBuf]=v;
        inBuf=(inBuf+1)%size;
        count++;
        if(count== 1) notify();
    }
    public synchronized String fetch(){
        String v;
        while(count==0){
            try{
                wait();
            }catch(InterruptedException e){}
        }
    
        v=buffer[outBuf];
        outBuf=(outBuf+1)%size;
        count--;
        if(count==size-1) notify();
        return v;
}}
