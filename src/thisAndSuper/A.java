package thisAndSuper;

public class A {
	
	int x=99;//global variable from A class 
	int y=101;// global variable from A class

	public static void main(String[] args) {
		
		A a=new A();
		a.demo1();
		
	}
	
	public void demo1()
	{
		int x=12; //local variable from A class 
		int sum =100+this.x;//used global value +of x using this keyword 
		System.out.println(sum);
		
		int sub = 100-x;//used local value of x
		System.out.println(sub);
	}

}
