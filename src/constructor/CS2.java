package constructor;

public class CS2 {
     
	int a = 10;
	int b = 20;
	//variable initialize
	public CS2()
	{
		a=90;//initializing variables using zero parameter constructor
		b=100;
	}
	
	public CS2(int x,int y)//initializing variable using two parameter constructor
	{
		a=x;//1,11
		b=y;//1,10
	}
	
	public static void main(String[] args) {
		CS2 cs2 = new CS2();//initialized object using zero parameter constructor
		cs2.addition();//this object will call zero parameter constructor and initialize variables
		
		CS2 cs = new CS2(1,1);//initialized object using two parameter constructor
		cs.addition();//this object will call two parameter constructor and initializes variable
		
		CS2 c = new CS2();
		c.addition();
		
		CS2 c2 = new CS2(11,10);
		c2.addition();
		
		
	}
	
	public void addition()//non-static regular method
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	
	}

		
}
	

	