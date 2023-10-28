package LP2.PoolThread;



public class RunnableTask implements Runnable{
    private int r;
    public RunnableTask(int r){
        this.r=r;
    }
    public void run(){
        System.out.println("Thread: "+Thread.currentThread().getName()+" executando a tarefa: "+r);
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("\tThread: "+Thread.currentThread().getName()+" finalizou a tarefa: "+r);
    }
}
