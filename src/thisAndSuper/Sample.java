package thisAndSuper;

public class Sample {
	
	int a=90;
	int b=10;
	static int x=88;//static global variable

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.add();

	}
	
	public void add()
	{
		int a =10;
		int sum = a+100;
		System.out.println(sum);
		int sum1= this.a+100;
		System.out.println(sum1);
		
		int sub=100-b;
		
		int x=10;
		int sub1=100-x;//called local variable
		System.out.println(sub1);
		int sub2=100-Sample.x;//called global static variable
		System.out.println(sub2);
		
		
	}

}
