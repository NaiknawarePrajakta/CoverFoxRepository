package methodsStudy;

public class MathsOperation {

	public static void main(String[] args) {
		
	MathsOperation mo = new MathsOperation();
	mo.addition();//calling method without parameter
	mo.addition(11,22);//calling method with parameter
	mo.addition(1,2);
	subtraction();//calling static method without parameter
	subtraction(88,80);//calling static method with parameter
	subtraction(10,9);//calling static method with parameter

	}
	
	public void addition()// method without parameter
	{
		int a = 10;
	    int b = 20;
		int sum = a+b;
		System.out.println("addition is "+sum);
	}
	
	public void addition(int a, int b)//method with parameters
	{
		int sum = a+b;
		System.out.println("Addition is "+sum);
	}
	
		public static void subtraction()//method without parameters
		{
			int x=99;
			int y=90;
			int sub=x-y;
			System.out.println("subtraction is "+sub);
		}
		
		
		public static void subtraction(int x, int y)//method with parameter
		{
			int sub=x-y;
			System.out.println("subtraction is "+sub);
		}

	
}
