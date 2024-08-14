package PatternProgram;

public class Eg12 {

	public static void main(String[] args) 
	{
		 // *
		  //* *
		 // * * *
		  //* * * *
		  //* * * 
		 // * *
	    //  *
		
		//rows-->7 star-->1
		//outer for loop--> row
		
		int row=7;
		int star=1;
		for(int i=1;i<=row;i++)
		{
		//inner for loop-->star
		for(int j=1;j<=star;j++)
		{
		System.out.print("*");

		}
		System.out.println();
		if(i<4)
		{
		star++;
		}
		else
		{
		star--;
		}
		}

	}

}
