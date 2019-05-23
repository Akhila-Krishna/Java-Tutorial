//Create 3 child Threads.

class NewThread implements Runnable{
	String name;
	Thread t;

	NewThread(String threadname){
		name=threadname;
		t= new Thread(this , name);
		System.out.println("New Thread " +t);
		t.start();
	}

	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+ " Thread " +i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(name+ " Interrupted!!");
			}
	System.out.println(name+ " Exiting!!");
	}
}

class MultipleThreads{
	public static void main(String args[]){
		new NewThread("A");
		new NewThread("B");
		new NewThread("C");

		try{
                        Thread.sleep(10000);
                }catch(InterruptedException e){
                        System.out.println("Main Thread Interrupted!!");
                        }
	System.out.println("Exiting Main Thread!!");
	}
}
