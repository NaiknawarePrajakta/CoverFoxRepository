package methodsStudy;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		System.out.println("=======================");
		Calculator calculator1 = new Calculator();//another object
		calculator1.addition();
		calculator1.subtraction();
		multiplication();
		division();
	}
	
	public void addition()//non static method
	{
		int a = 100;//variable declaration + initialization
		int b = 90;//variable declaration + initialization
		int sum = a+b;
		System.out.println("Addition is "+sum);
		
	}
	
	public void subtraction()
	{
		int a = 10;//variable declaration+initialization
		int b = 90;//variable declaration+initialization
		int sub = a-b;
		System.out.println("Subtraction is "+sub);
		
	}
	
	public static void multiplication()
	{
		int a = 10;//variable declaration+initialization
		int b = 90;//variable declaration+initialization
		int mul = a*b;
		System.out.println("Multiplication is "+mul);
		
	}
	
	public static void division()
	{
		int a = 100;//variable declaration+initialization
		int b = 90;//variable declaration+initialization
		float div = a/b;
		float rem = a%b;
		System.out.println("Division is "+div);
		System.out.println("Remainder is "+rem);
	}
						
}
