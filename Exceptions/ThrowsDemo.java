//Demonstrate Throws

class ThrowsDemo{
  static void Demo() throws IllegalAccessException{
	System.out.println("Inside Demo!!");
	throw new IllegalAccessException("Demo");
  }
  public static void main(String args[]){
	try{
		Demo();
	}catch(IllegalAccessException e){
		System.out.println("Caught " +e);
		}
  }
}
