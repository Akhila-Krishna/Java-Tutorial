class Example
{
	public static void main(String args[])
	{
		String s;
		s="Hello Moto";
		int A[][]=new int[5][];
		A[0]=new int[1];
		A[1]=new int[2];
		A[2]=new int[3];
		A[3]=new int[4];
		A[4]=new int[5];
		int i,j,k=0;
		for(i=0;i<5;i++)
			for(j=0;j<i+1;j++)
			{
				A[i][j]=k;
				k++;
			}
		for(i=0;i<5;i++)
		{
                        for(j=0;j<i+1;j++)
                                System.out.print(A[i][j] + " ");
                	System.out.println();
		}
		System.out.println(" " + s);
	}
}
