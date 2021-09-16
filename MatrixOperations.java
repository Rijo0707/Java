public class MatrixOperations {
	
	static void sum(int a[][],int b[][])       //Sum of 2 matrices
	{
		int sum[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void product(int a[][],int b[][])    //Product of 2 matrices
	{
		int product[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				product[i][j]=0;
				for(int k=0;k<3;k++)
				{
					product[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};
		System.out.println("Sum of 2 matrices are-");
		sum(a,b);
		System.out.println("Product of 2 matrices are-");
		product(a,b);
	}

}
