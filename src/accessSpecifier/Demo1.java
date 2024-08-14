package accessSpecifier;

public class Demo1 {
	
	private int a=10;
	int b=20;
	protected int c=100;
	public int d=90;

	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.test1();//calling private method within class 
		System.out.println(demo.a);//calling private global variable within class 
		
		demo.test2();//calling default method within class 
		System.out.println(demo.b);//calling default global variable within class 
	     
		demo.test3();//calling protected method within class
		System.out.println(demo.c);
		
		demo.test4();//calling public method within class
		System.out.println(demo.d);
	
	}
	
	private void test1()
	{
		System.out.println("this is demo's private test1 method");
	}
	void test2()
	{
		System.out.println("this is default test2 method");
	}
	
	protected void test3()
	{
		System.out.println("This is demos protected test3 method");
	}
	
	public void test4()
	{
		System.out.println("This is demos public test4 method");
	}
}
