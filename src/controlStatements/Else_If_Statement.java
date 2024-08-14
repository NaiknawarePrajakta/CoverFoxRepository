package controlStatements;

public class Else_If_Statement {

	public static void main(String[] args) {
		
		//>=60-->1st class
		//>=50--> 2nd class 
		//>=40--> just pass
		//<40--> fail
		
		//if marks greater than or equal to 60 then you are in 1st class
		// else if marks greater than or equal to 50 then you are in 2nd class 
		//else if marks greater than or equal to 40 then you just in pass class
	    // else you are fail
		
		int marks = 17;
		
		if(marks>=60)
		{
			System.out.println("you are in 1st class");
			
		}
		else if (marks>=50)
		{
			System.out.println("you are in 2nd class");
		}
		
		else if(marks>=40)
		{
			System.out.println("you are in pass class");
		}
		else
		{
			System.out.println("you are fail");
		}
		
		//Assignment--> signal
		
		//red
        //green
		//yellow
		
		//if signal is red then stop
	    //if signal is green then go
		//if signal is yellow go slow
		
		String signal= "green";
		if(signal=="red")
		{
			System.out.println("signal is red then stop");
		}
		else if(signal=="green")
		{
			System.out.println("signal is green then go");
		}
		else if (signal=="yellow")
		{
			System.out.println("signal is yellow then go slow");
		}
		else
			
		{
			System.out.println("signal is not display then go slow");
		}
	}

}
