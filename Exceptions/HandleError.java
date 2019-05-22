//Handle an exception and move on.

import java.util.Random;

class HandleError{
  public static void main(String args[]){
	int a=0,b=0,c=0;
	Random r = new Random();

	for(int i=0;i<10;i++){
		try{
			b=r.nextInt();
			c=r.nextInt();
			a=12345/(b/c);
		}catch(ArithmeticException e){
			System.out.println("Exception " +e);  //Throwable ovverides toString() --> returns a string containing the exception.
			System.out.println("Divide by zero!!");
			a=0;
			}
		System.out.println("A is " +a);
	}
  }
}
