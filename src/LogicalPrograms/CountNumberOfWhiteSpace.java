package LogicalPrograms;

public class CountNumberOfWhiteSpace {

	public static void main(String[] args) {
		
		String s= "v e loc it  y";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)//0
		{
			char temp = s.charAt(i);
			if(temp==' ')
			{
				count++;
			}
			
		}
		System.out.println("number of White Spaces are "+count);
			

	}

}