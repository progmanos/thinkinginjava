import java.util.concurrent.*;

public class FixedThreadPoolExThree {
  public static void main(String[] args) {
   ExecutorService exec = Executors.newFixedThreadPool(5);
   for(int i = 1; i < 6; i++) { 
    exec.execute(new MyRunnableExOne(i));
   }
   exec.shutdown();
  }
}
