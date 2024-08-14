package PatternProgram;

public class Eg5 {

	public static void main(String[] args) {
		
		//* * * * *
		//* * * *
		//* * *
		//* *
		//*

		//row-->5 columns-->5 stars-->5
		int row=5;
		int column=5;
		int star=5;
		//outer for loop-->rows
		for(int i=1;i<=row;i++)
		{
		//inner for loop-->coulmns
		for(int j=1;j<=star;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		star--;
		}
	}

}
