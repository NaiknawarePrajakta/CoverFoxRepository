package controlStatements;

public class If_Statement {

	public static void main(String[] args) {
		//if marks are greater than 40 then you are pass
		
		
		//data Type + variable
		
		int marks=9;
		
		//if(condition)//marks>40
		//{
			//statement to be executed
		//}
		
		if(marks>40)//true
			
		{
			System.out.println("you are pass");
		}
		
		//if signal is red then stop
		
		String signal="red";
		if(signal=="red")//false-->true
		{
			System.out.println("stop");
		}
		
		// Assignment
		//if you are male (M/F)then turn right
		
		char gender='M';
		
		if(gender=='M')
		{
			System.out.println("turn right");
		}
		
	}

}
