package LogicalPrograms;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		int number = 1234;
		int revNumber=0;
		
		for(int i=number;i>0;i=i/10)//1234,123,12,1
		{
			int rem =i%10;//4,3,2,1
			revNumber=revNumber*10+rem;
			//4=0*10+4
			//43=40+3
			//432=43*10+2
			//4321=432*10+1
		}
		System.out.println(revNumber);

	}

}