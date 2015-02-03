import java.util.concurrent.*;

public class SingleThreadExecutorExThree {
  public static void main(String[] args) {
   ExecutorService exec = Executors.newSingleThreadExecutor();
   for(int i = 1; i < 6; i++) { 
    exec.execute(new MyRunnableExOne(i));
   }
   exec.shutdown();
  }
}
