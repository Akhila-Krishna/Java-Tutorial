//Demonstrate finally

class FinallyDemo{
  static void proA(){
	try{
		System.out.println("Inside A");
		throw new RuntimeException("Run");
	}finally{
		System.out.println("A's finally");
		}
  }
  static void proB(){
        try{
                System.out.println("Inside B");
                return;
        }finally{
                System.out.println("B's finally");
                }
  }
  static void proC(){
        try{
                System.out.println("Inside C");
                return;
        }finally{
                System.out.println("C's finally");
                }
  }

  public static void main(String args[]){
	try{
		proA();
	}catch(Exception e){
		System.out.println("Exception " +e);
		}
	proB();
	proC();
  }
}
