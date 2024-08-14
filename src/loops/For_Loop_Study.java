package loops;

public class For_Loop_Study {

	public static void main(String[] args) {
		
		
		//   System.out.println(2);
		//   System.out.println(2);
		//   System.out.println(2);
		//   System.out.println(2);
		//   System.out.println(2);
		
		   // I want print "2" 10 times
		   // initialization-->0,1
		   // condition-->10
		   // updation--> incremental  decremental
		
		//  for(initialization;condition;updation)
		//  {
			   //operation-->task
		      //System.out.println(2);
		//  }
		
		for(int a=1;a<=10;a++)
		{
			System.out.println(2);// 2,2,2.....2
		}
		
		System.out.println("=============================");
		
		//I want to Print table of 3
		//3,6,9,12,15,.........30
		
		//initialization-->3
		//condition -->30
		//updation-->incremental i+3
		
		for(int i=3;i<=30;i=i+3)//i=3,6,9,12,15,18,30,33
		{
			System.out.println(i);//3,6,9,...27,30
		}
		System.out.println("================================");
		
		//I want to Print table of 3 in reverse order 
				//30,27...6,3
				
				//initialization-->30
				//condition -->3
				//updation-->decremental x-3
		
		
		for(int x=30;x>=3;x=x-3)
		{
			System.out.println(x);
		}
		System.out.println("================================");
		
		//I want to print pune 5 times
		//initialization-->1
		//condition -->5
		//updation-->incremental ++
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Pune");
		}
		
	}

}
