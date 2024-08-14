package polyMorphism;

public class Sample {

	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.sum();
		sample.sum(1,1);
	}
	//method overloading :
	//Declaration multiple methods with same method name but with different argument
	//in  a same class is called method overloading 
	
	public void sum()
	{
		int a=10;
		int b=20;
		int sum =a+b;
		System.out.println("Sum is "+sum);
	}
	public void sum(int a,int b)
	{
		int sum = a+b;
		System.out.println("sum is "+sum);
	}
	
		
	}

