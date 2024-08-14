package thisAndSuper;

public class B extends A {
   int x=1;//global variable from B class (subclass)
	public static void main(String[] args) {
		 B b=new B();
		 b.demo2();
	}
	
	public void demo2()
	{
		int x=2;//local value from B class (subclass)
		int sum1=100+x;//used local value of x
		System.out.println(sum1);
		
		int sum2=100+this.x;//used global value of x from B class (subclass)
		System.out.println(sum2);
		
		int sum3=100+super.x;//used super class global value of x from A class (super class)
		System.out.println(sum3);
		
		int sum4=100+y;//used super class global variable 
		//as there is no y variable in sub class, so there is no need of super keyword 
	}

}
