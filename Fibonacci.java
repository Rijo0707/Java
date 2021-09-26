import java.util.Scanner;
public class Fibonacci 
{
	public static void fib(int num)
	{
		int first=0,second=1,third;
		System.out.print(first+" "+second);
		for(int i=0;i<num;i++)
		{
			third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
			
		}
	}
	public static void main(String[]  args)
	{
		int n;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=x.nextInt();
		fib(n);
	
	}
}
