package methodsCall;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method running");
         testMe();
         testMe();
         testMe();
         System.out.println("main method finished");
         
         // calling static regular method from another class 
         // syntax --> className.methodName();
         Demo1.display();// calling static regular method from another class
         Demo1.display2();// calling static regular method from another class
	}
	
	public static void testMe()
	{
		System.out.println("This is testMe static regular method");
		Demo1.display();
	}

}
