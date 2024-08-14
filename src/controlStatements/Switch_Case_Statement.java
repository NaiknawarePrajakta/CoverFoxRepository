package controlStatements;

public class Switch_Case_Statement {

	public static void main(String[] args) {
		
		//days-->1,2....7
		
		int day=2;
		
		switch (day) {
		case 1:System.out.println("Today is Sunday");
	    break;
	    
		case 2:System.out.println("Today is Monday");
	    break;
	    
		case 3:System.out.println("Today is Tuesday");
	    break;
	    
		case 4:System.out.println("Today is Wednesday");
	    break;
	    
		case 5:System.out.println("Today is Thursday");
	    break;
	    
		case 6:System.out.println("Today is Friday");
	    break;
	    
		case 7:System.out.println("Today is Saturday");
	    break;

		default:System.out.println("Please enter value between 1 to 7");
	    break;
		}

		//M-->
		//F-->
		char gender='M';
		switch (gender)
		{
		case 'M':System.out.println("you are male");
		break;
		
		case 'F':System.out.println("you are female");
		break;

		default:System.out.println("Please enter gender values between M/F");
		break;
		}
		{
		
		}
	}

}
