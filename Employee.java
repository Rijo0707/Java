import java.util.Scanner;

public class Employee {
	public static int joiningyear,salary;
	public static String name,address;
	public static void getInput() {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the employee name: ");  
		name=x.nextLine();
		System.out.print("Enter the joining year: ");  
		joiningyear=x.nextInt();
		System.out.print("Enter the salary: ");  
		salary=x.nextInt();
		System.out.print("Enter the address: ");  
		address=x.next();
	}
	public static void print() {
		Scanner x=new Scanner(System.in);
		System.out.println("Employee name: "+name);  
		System.out.println("Joining year: "+joiningyear);  
		System.out.println("Salary: "+salary);  
		System.out.println("Address: "+address);  
	}
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.getInput();
		System.out.println("\nOutput-");
		obj1.print();
	}

}
