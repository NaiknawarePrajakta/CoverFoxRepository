package LogicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//10-->1,2,5
		//3-->1,3
		//11-->1,11
		
		int num = 11;
		int count=0;
		for(int i=2;i<num;i++)
		{
		     if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Number is Prime Number");
		}
		else
		{
			System.out.println("Number is not Prime Number");
		}
		
	}

}
