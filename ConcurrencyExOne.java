

class MyRunnable implements Runnable {
  private int messageNumber = 0;
  public MyRunnable (int i) {
    messageNumber = i;
    System.out.println("Starting MyRunnable number: " + messageNumber);
  }
  
  public void run() {
    System.out.println("Printing my message number: " + messageNumber);
    Thread.yield();
    System.out.println("Shutting down message number: " + messageNumber);
  }

  
}

public class ConcurrencyExOne {

  public static void main(String[] args) {
    for(int i = 0; i < 10; i++) {
	new Thread(new MyRunnable(i)).start();
    }
  }
}
