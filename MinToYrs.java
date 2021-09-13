import java.util.Scanner;

public class MinToYrs {

	public static void main(String[] args) {
		MinToYrs obj1=new MinToYrs();             //creating object
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the minutes: ");  //Input
		int minutes=x.nextInt();
		obj1.convert(minutes);                    //Calling method
		
	}
	public static void convert(int minutes) {   //Method  Declaration
		double years,days;
		years=(double)minutes/525600;
		days=(years-(int)years)*365;
		System.out.println(minutes+" minutes is approximately "+(int)years+" years and "+(int)days+" days");
	}
}
