package methodsCall;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println("Hi this is main method");
		//calling static method from same class 
		//just call using method name in main method -->eg methodName();
		    display();//we are calling static method from same class
		    display2();//we are calling static regular method from same class

	}
	
	public static void display()//static complete method
	{
		System.out.println("Hi this is display static method");
	}
	
	public static void display2()// static complete method 
	{
		System.out.println("Hi this is display2 static method ");
		
		
	}
	

}
