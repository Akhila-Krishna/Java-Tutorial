//Demonstrates multiple catches.

class multiplecatch{
  public static void main(String args[]){
	try{
		int a = args.length;
		int b = 20/a;
		int c[] ={1};
		c[11] = 11;
	}catch(ArithmeticException e){
		System.out.println("Exception " +e);
		}
	 catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception " +e);
		}
  	System.out.println("Try-Catch completed!!");
  }
}
