class MyRunnableExOne implements Runnable {
  private int messageNumber = 0;
  private int countdown = 10;
  public MyRunnableExOne (int i) {
    messageNumber = i;
    System.out.println("Starting MyRunnableExOne number: " + messageNumber);
  }
  
  public void run() {
    while(countdown-- > 0) {
     System.out.println("message number: " + messageNumber + " at countdown " + countdown);
     Thread.yield();
    }
    System.out.println("Shutting down message number: " + messageNumber);
  }


}
