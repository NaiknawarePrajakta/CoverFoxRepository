package LogicalPrograms;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		
		//count char A
		String s="RADAR";
		int Count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char temp = s.charAt(i);
			if(temp=='A')
			{
				Count++;
			}
			
		}
		System.out.println("Occurance Of A is "+Count);
		}
	}


