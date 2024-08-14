package abstractClass;

public class B extends A  {
      //concrete class
	public static void main(String[] args)
	{
		B b=new B();
		b.test1();
		b.test2();
		b.test3();
		b.test4();
		b.test5();
				
	}

	@Override
	public void test3() {
		System.out.println("Class A's method complete in concrete class");
		
	}

	@Override
	public void test4() {
		System.out.println("Class A's method complete in Concrete class");
		
	}
	
	public void test5()
	{
		System.out.println("Class B's own method");
	}

	
	
}
