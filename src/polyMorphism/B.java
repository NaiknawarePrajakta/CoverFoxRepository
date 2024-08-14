package polyMorphism;

public class B extends A{

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		a.greeting();
	}
    
	public void greeting ()
	{
		System.out.println("Good Evening");
	}
}
