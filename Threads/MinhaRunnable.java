package Threads;

public class MinhaRunnable implements Runnable{
    static String message;
    public void run(){
       message= "A vida é doce";
        }


    public static void main(String[] args) {
        message="A vida passa";
        Thread t= new Thread(new MinhaRunnable());
        t.start();
        System.out.println(message);
    }
    }
