package constructorChaning;

public class B extends A {
	
	public B()
	{    super(33);//calling super class constructor in sub class constructor
		System.out.println("Class B constructor");
	}
	
	public B(int b)
	{
		System.out.println("Class B constructor "+b);
	}

	public static void main(String[] args) {
		B b=new B();
	}

}
