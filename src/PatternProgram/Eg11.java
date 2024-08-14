package PatternProgram;

public class Eg11 {

	public static void main(String[] args) 
	{
		//* * * *
		 //* * *
		  //* *
		   //*
		
		// row-->4 star-->4 space-->0
		
		int row = 4;
		int star = 4;
		int space = 0;

		// outer for loop--> rows
		for (int i = 0; i <= row; i++) {
		// inner for loop
		// space
		for (int j = 1; j <= space; j++) {
		System.out.print(" ");
		}
		// star
		for (int k = 1; k <= star; k++) {
		System.out.print("* ");
		}
		System.out.println();
		star--;
		space++;
		}

	}

}
