//Nested try statement.

class nesttry{
  public static void main(String args[]){
	try{
		int a=args.length;
		int b=20/a;
		try{
			if(a==1)
				a=a/(a-a);
			if(a==2){
				int c[]={1};
				c[10]=10;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception " +e);
			}
	}catch(ArithmeticException e){
		System.out.println("Exception " +e);
		}
  }
}
