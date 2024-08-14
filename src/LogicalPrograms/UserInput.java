package LogicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		//int a=10;
		//int b=20;
		 //int sum=a+b;

		//System.out.println(sum);
		//scanner class
		//String int float char boolean
		Scanner sc= new Scanner(System.in);
		// System.out.println("Enter your name");
		//
		// String name = sc.next();
		//
		// System.out.println("My name is "+name);
		//

		System.out.println("Enter your 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter your 2nd Number");
		int b = sc.nextInt();
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}

}
