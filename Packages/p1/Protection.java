//Access Conrol Example Illustration.

package p1;

public class Protection{
	int n=1;
	private int n_pri=2;
	protected int n_pro=3;
	public int n_pub=4;

	public Protection(){
		System.out.println("Base Constructor");
		System.out.println("Default " +n);
		System.out.println("Private " +n_pri);
		System.out.println("Protected " +n_pro);
		System.out.println("Public " +n_pub);
	}
}
