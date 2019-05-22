//try block and catch clause that processes the ArithmeticException.

class trycatch1{
 public static void main(String args[]){
	int a,b;

	try{
		b=0;
		a=20/b;
		System.out.println("This will not be printed.");        //never excecuted.
	}catch(ArithmeticException e){					//catch is put differently and hence excecution not returned.
		System.out.println("Exception!! Divide by zero.");
	        }
	System.out.println("Completed catch.");
 }
}
