//Creating a thread by extending the Thread

class NewThread extends Thread{

        NewThread(){
                super("Demo Thread");
                System.out.println("Child Thread " +this);
                start();
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

class CreateThread2{
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
