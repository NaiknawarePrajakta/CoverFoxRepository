package methodsStudy;

public class Test1 {

	public static void main(String[] args) //   this is main method  
	{
		System.out.println("main method running");
		//I want to call static regular method from same class 
		//methodName();
		m1();//calling static method from same class
		
		//I want to call non static regular method from same class
		//we need object from same class 
		//ClassName objectName= new className();
		
		Test1 test1 = new Test1();//created object of Test1 Class 
		
		//how to call non static regular method 
		//objectName.methodName();
		
		test1.m2();//calling non-static method from same class
		System.out.println("==================================");
		
		//calling static method from another class 
		//className.methodName();
		
        Test2.m3();//calling static method from another class
        //calling non static method from another class 
        //we need to object from the class whose method we want to call 
		
		Test2 test2 = new Test2();//created object from another class 
		//how to call non static regular method
		//objectName.methodName();
		
		test2.m4();//calling non static method from another class 
		
		System.out.println("Main method stopped");
		
	}
	
	   //static, non static regular methods
	
	   public static void m1() //this is static regular method
	   {
		System.out.println("This is static regular m1 method from Test1 class ");
		
	   
	} 
	   public void m2()// this is non static regular method
	   {
		   System.out.println("This is non static regular m2 method from Test1 class");
	   }

}

