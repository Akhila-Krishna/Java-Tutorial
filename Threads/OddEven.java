//Print odd and Even numbers using 2 Threads.

class OddThread implements Runnable{
        String name;
        Thread t;

        OddThread(String threadname){
                name=threadname;
                t= new Thread(this , name);
                System.out.println("Odd Thread " +t);
                t.start();
        }

        public void run(){
                try{
                        for(int i=1;i<100;i+=2){
                                System.out.println(name+ "  " +i);
                                Thread.sleep(500);
                        }
                }catch(InterruptedException e){
                        System.out.println(name+ " Interrupted!!");
                        }
        System.out.println(name+ " Exiting!!");
        }
}

class EvenThread implements Runnable{
        String name;
        Thread t;

        EvenThread(String threadname){
                name=threadname;
                t= new Thread(this , name);
                System.out.println("Even Thread " +t);
                t.start();
        }

        public void run(){
                try{
                        for(int i=0;i<=100;i+=2){
                                System.out.println(name+ "  " +i);
                                Thread.sleep(500);
                        }
                }catch(InterruptedException e){
                        System.out.println(name+ " Interrupted!!");
                        }
        System.out.println(name+ " Exiting!!");
        }
}

class OddEven{
        public static void main(String args[]){
                new OddThread("Odd");
                new EvenThread("Even");

                try{
                        Thread.sleep(10000);
                }catch(InterruptedException e){
                        System.out.println("Main Thread Interrupted!!");
                        }
        }
}

