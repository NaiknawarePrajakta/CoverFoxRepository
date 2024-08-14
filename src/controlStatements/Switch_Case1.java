package controlStatements;

public class Switch_Case1 {

	public static void main(String[] args) {
		
		//Assignment --> jan feb mar apr may...... dec
		
		String month="Aug";
		
		switch (month) {
		case "Jan":System.out.println("This is Jan month");
		break;
		
		case "Feb":System.out.println("This is Feb month");
		break;
		
		case "Mar":System.out.println("This is Mar month");
		break;
		
		case "Apr":System.out.println("This is Apr month");
		break;
		
		case "May":System.out.println("This is May month");
		break;
		
		case "June":System.out.println("This is June month");
		break;
		
		case "July":System.out.println("This is July month");
		break;
		
		case "Aug":System.out.println("This is Aug month");
		break;
		
		case "Sep":System.out.println("This is Sep month");
		break;
		
		case "Oct":System.out.println("This is Oct month");
		break;
		
		case "Nov":System.out.println("This is Nov month");
		break;
		
		case "Dec":System.out.println("This is Dec month");
		break;

		default:System.out.println("Please enter month between Jan to Dec");
		break;
		}
	}
}