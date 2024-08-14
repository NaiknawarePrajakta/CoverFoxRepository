package PatternProgram;

public class Eg4 {

	public static void main(String[] args) 
	{
		 // *
		  //* *
		 // * * *
		  //* * * *
		  //* * * * *
		
		// row->5 columns-->5
		// 1st row stars count--> star-->1
		int row = 5;
		int coulmn = 5;
		int star = 1;
		// outer for loop--> rows
		for (int i = 1; i <= row; i++) {
		// inner for loop-->columns
		for (int j = 1; j <= star; j++) {
		System.out.print("*");
		}
		System.out.println();
		star++;
		}
	}

}
