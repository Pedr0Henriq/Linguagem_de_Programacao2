
import java.util.concurrent.*;
public class ExecutorTest {
    public static void main(String[] args) {
        Executor ex= Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++){
            RunnableTask r=new RunnableTask(i);
            ex.execute(r);
        }
        
    }
}
