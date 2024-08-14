package LogicalPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s= "NITIN";
		String rev = "";
		System.out.println("Original String "+s);
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse String "+rev);
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
