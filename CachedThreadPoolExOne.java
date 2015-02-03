import java.util.concurrent.*; 


public class CachedThreadPoolExOne {
  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    for(int i = 0; i < 10; i++) {
      exec.execute(new MyRunnableExOne(i));
    }

    exec.shutdown();
  }
}
