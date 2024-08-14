package methodsCall;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // To create object then follow syntax 
		//classname objectName= new className();
		
		A a = new A();//created object a from A class 
		  //to call non static method from same class 
		  // objectName.methodName();
		
		a.method1();
		
		// to call non static method from another class --> create an object of that class 
		//to call swargate method from city class, we need to create object of city class
		
		City mumbai = new City();//created object of another class
		//to call non static method from another class
		//objectName.methodName();
		
		mumbai.swargate();//called non static method from another class
	}
	
	public void method1()
	{
		System.out.println("This is non static method1");
	}

}
