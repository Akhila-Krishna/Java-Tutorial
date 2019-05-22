//intentionally causing an exception that is not caught

class uncaughtE{
  static void subroutine(){
	int d=0;
	int a=20/d;
	}
  public static void main(String args[]){
	uncaughtE.subroutine();
 	}
}


//line 9 caused the exception at line 6
//pinpoints the precise sequence of steps that led to the error.
