package controlStatements;

public class If_Else_Statement {

	public static void main(String[] args) {
		
	//if your marks greater than or equal to 40 then you are pass
		//else you are fail
		
		// if(condition)
		//{
			//statement to be executed
		//}
		// else
		//{
		//	another statement
		//}
		
		int marks = 40;
		
		if(marks>=40)
		{
			System.out.println("you are pass");
		}
		else
		{
			System.out.println("you are fail");
			
		}
		
		//if signal is red then stop 
		//else go
		
		String signal="red";
		
		if(signal=="red")
		{
			System.out.println("stop");
		}
		
		else
		{
			System.out.println("go");
		}
		
		//assignment
		//if you are male (M) then turn right 
		// else turn left
		
		char male='M';
		
		if(male=='F')
		{
			System.out.println("turn right");
		}
		
		else
		{
			System.out.println("turn left");
			
		}
	}

}
