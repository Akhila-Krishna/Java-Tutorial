//Controlling the main thread.

class CurrentThreadDemo{
  public static void main(String args[]){
	Thread t=Thread.currentThread();

	System.out.println("Current thread : " +t);
	String s = t.getName();
	int p = t.getPriority();
	System.out.println("Thread Name : " +s);
	System.out.println("Thread Priority : " +p);
	t.setName("My thread");
	System.out.println("Thread after name change : " +t);

	try{
		for(int n=5;n>0;n--){
			System.out.println(n);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		System.out.println("Main Thread Interrupted!!");
		}
  }
}
