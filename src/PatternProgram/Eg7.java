package PatternProgram;

public class Eg7 {

	public static void main(String[] args)
	{
		
	             //	*        
		      //  * *
		    //  * * *
		   // * * * *
		 // * * * * *
		
		// row-->5 column star-->1 space-->4
		
		int row=5;
		int star=1;
		int space=4;
		//outer for loop-->row
		for(int i=1;i<=row;i++)
		{

		//inner for loop -->column
		//space
		for(int j=1;j<=space;j++)
		{
		System.out.print(" ");
		}
		//star
		for(int k=1;k<=star;k++)
		{
		System.out.print("*");
		}
		System.out.println();
		space--;
		star++;
		}

	}

}
