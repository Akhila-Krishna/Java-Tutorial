//Creating a Thread by implementing Runnable.

class NewThread implements Runnable{
	Thread t;

	NewThread(){
		t= new Thread(this , "Demo Thread");
		System.out.println("Child Thread " +t);
		t.start();
	}
     public void run(){
	try{
		for(int i=5;i>0;i--){
			System.out.println("Child Thread " +i);
			Thread.sleep(500);
		}
	}catch(InterruptedException e){
                        System.out.println("Child Thread Interrupted!!");
                        }
	System.out.println("Exiting Child Thread!!");
     }
}

class CreateThread1{
   public static void main(String args[]){
	new NewThread();

	try{
		for(int i=5;i>0;i--){
                	System.out.println("Parent Thread " +i);
                	Thread.sleep(1000);
         	}
        }catch(InterruptedException e){
                System.out.println("Parent Thread Interrupted!!");
                }
        System.out.println("Exiting Parent Thread!!");
     }
}
