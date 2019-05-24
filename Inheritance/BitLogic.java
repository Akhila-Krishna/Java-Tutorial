class BitLogic
{
	public static void main(String args[])
	{
		String Binary[]={"0000" , "0001" , "0010" , "0011" , "0100" , "0101" , "0110" , "0111" , "1000" , "1001" , "1010" , "1011" , "1100" , "1101" , "1110" , "1111"};
		int a=3;
		int b=6;
		int c=a|b;
		int d=a&b;
		int e=a^b;
		int f=(~a&b)|(a&~b);
		System.out.println(Binary[a]+ " ");
		System.out.println(Binary[b]+ " ");
		System.out.println(Binary[c]+ " ");
	        System.out.println(Binary[d]+ " ");
	        System.out.println(Binary[e]+ " ");
		System.out.println(Binary[f]+ " ");
	}
}
