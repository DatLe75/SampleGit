package sample.ui;

public class RunnableDemo  implements Runnable {
	 
	   @Override
	   public void run() {
	       int idx = 1;
	       for (int i = 0; i < 5; i++) {
	           System.out.println("    - RunnableDemo running " + idx++);
	           // Ngủ 2 giây.
	           try {
	               Thread.sleep(2000);
	           } catch (InterruptedException e) {
	           }
	       }
	       System.out.println("    - ==> RunnableDemo stopped ");
	   }

}
