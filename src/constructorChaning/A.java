package constructorChaning;

public class A {
	
	public A()
	{     this(12);//constructor chaining 
	  //calling another constructor in constructor 
		System.out.println("User defined zero parameter constructor");
	}
	
	public A(int a)
	
	{
		System.out.println("User Defined single parameter constructor");
		System.out.println(a);
	}
	
	public A(String name)
	{
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		A a=new A();
		//A a1 = new A(90);
	}

}
