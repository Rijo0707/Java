import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		int choice;
		Scanner x=new Scanner(System.in);
		System.out.println("Select from one of the options: \n1.Option A\n2.Option B\n3.Option C\n4.Option D");  
		choice=x.nextInt();           //Input
		switch(choice)
		{
		case 1: System.out.println("Option A selected");
				break;
		case 2: System.out.println("Option B selected");
				break;
		case 3: System.out.println("Option C selected");
				break;
		case 4: System.out.println("Option D selected");
				break;
		default: System.out.println("Invalid option selected");
		}
	}

}
