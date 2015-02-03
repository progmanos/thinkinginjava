interface Generator<T> { T next(); }

class Fibonacci implements Generator<Integer> {
  private int count = 0;
  public Integer next() { return fib(count++); }
  private int fib(int n) { 
   if(n < 2) return 1;
   return fib(n - 2) + fib(n -1);
  }
}

class RunnableFib implements Runnable {
  private Fibonacci gen;
  private int numberToGen;

  public RunnableFib(int n) {
   gen = new Fibonacci();
   System.out.println("Generating " + n + " Fibonacci numbers");
   numberToGen = n;
  }

  private String runFib(int n) {
   if(n <= 1) return gen.next().toString();
   return runFib(n - 1) + " " + gen.next();
  }

  public void run() {
   System.out.println(runFib(numberToGen) + " with numberToGen = " + numberToGen); 
  }
}

public class ConcurrentFibonacci {
  public static void main(String[] args) {
   for(int i = 1; i < 10; i++) {
     new Thread(new RunnableFib(i)).start();
   }
  }
}
