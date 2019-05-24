//Demonstrate isAlive() and join()

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
                                Thread.sleep(500);
                        }
                }catch(InterruptedException e){
                        System.out.println(name+ " Interrupted!!");
                        }
        System.out.println(name+ " Exiting!!");
        }
}

class JoinDemo{
        public static void main(String args[]){
                NewThread ob1 = new NewThread("A");
                NewThread ob2 = new NewThread("B");
                NewThread ob3 = new NewThread("C");

		System.out.println("Thread A is alive " +ob1.t.isAlive());
        	System.out.println("Thread B is alive " +ob2.t.isAlive());
        	System.out.println("Thread C is alive " +ob3.t.isAlive());

                try{
                        System.out.println("Waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
                }catch(InterruptedException e){
                        System.out.println("Main Thread Interrupted!!");
                        }
	System.out.println("Thread A is alive " +ob1.t.isAlive());
	System.out.println("Thread B is alive " +ob2.t.isAlive());
	System.out.println("Thread C is alive " +ob3.t.isAlive());
        System.out.println("Exiting Main Thread!!");
        }
}

