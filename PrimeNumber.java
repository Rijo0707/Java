import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int n,isPrime=0;
		System.out.print("Enter the number:  ");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime");
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not a prime number");
					isPrime=1;
					break;
				}
			}
		if(isPrime==0)
		{
			System.out.println(n+" is a prime number");
		}
		}
	}
}
