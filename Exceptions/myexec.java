//Creating my own exception

class myexec{
  static void demo() throws NullPointerException{
		throw new NullPointerException("Ha Ha!!");
  }

  public static void main(String args[]){
	try{
		demo();
	}catch(NullPointerException e){
		System.out.println("Caught " +e);
		}
  }
}
