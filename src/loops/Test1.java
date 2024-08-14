package loops;

public class Test1 {

	public static void main(String[] args) {
		
		//I want to write table of 5
		//start -->initialization 
		//condition--> >,<,>=,<=  i<=50
		//interval--> updation i=i+5
		
		for(int i=5;i<=50;i=i+5)
		{
			System.out.println(i);
		}
		System.out.println("===================");
		
		//start-->initialization 50
		//condition -->>=5
		//interval--> updation i=i-5
		
		for(int i=50;i>=5;i=i-5)
		{
			System.out.println(i);
		}
		System.out.println("========================");
		
		//for(;;)
		//{
		//	System.out.println("VELOCITY");
		//}
		
		// I want to write table of 5
		//start-->initialization 5
		//condition --> >,<,>=,<= i<=50
		//interval-->updation i=i+5
		System.out.println("========================");
		
		int j=5;
		while(j<=50)
		{
			System.out.println(j);
			j=j+5;
		}
		System.out.println("==============================");
		
		int k=50;
		while(k>=5)
		{
			System.out.println(k);
			k=k-5;
		}
		
	}

}
