package PatternProgram;

public class Eg3 {

	public static void main(String[] args) {
		// *****
		// *****
		// *****
		// row-->3 columns-->5
		// think about row 1st-->outer for loop rows
		// inner for loop--->for columns
		int row = 3;
		int column = 5;
		// outer for loop-->row

		for (int i = 1; i <= row; i++)// 1,2,3,4...
		{
		// inner for loop--> column
		for (int j = 1; j <= column; j++)// 1,2..5,6
		{
		System.out.print("*");
		}
		System.out.println();
		}

	}

}
