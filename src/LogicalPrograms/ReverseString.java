package LogicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "Velocity";//yticoleV
		System.out.println(s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)//7,6,5
		{
			rev=rev+s.charAt(i);
			        // y=""+y;
			        //yt=y+t;
			       //yti=yt+i;
		}
		System.out.println(rev);
	}

}
