package variableTypes;

public class Sample2 {
	
	
		int x=8;//non static global variable
		static int y=10;//static global variable

	public static void main(String[] args) {
		  
		//call global variables from same class 
		//to call non static global variable--> need to create object of class
		//objectName.variableName
		
		Sample2 sample2=new Sample2();
		System.out.println("calling non static global variable "+sample2.x);
		
		//call static global variable
		//static variable from same class --> call just by variable name
		System.out.println("calling static global variable "+y);
		
		
		//call global variable from another class 
		//to call non static global variable from another class --> create object of that class 
		Sample3 s3=new Sample3();//created object of another class 
		System.out.println("calling non static global variable from another class "+s3.m);
		
		//to call static global variable from another class
		//className.variableName
		
		System.out.println("calling static global variable from another class "+Sample3.n);
	}
	
	public void test1 ()//non static regular method 
	{
		int sum=10+x;//using global non static global variable in non static method 
		int sub=90-y;//using global static global variable in non static method
        System.out.println("sum is "+sum);
        System.out.println("sub is "+sub);
	}
	
	public static void test2()//static regular method
	{
		//int sum=10+x;
		int sub=90-y;
	}

}
