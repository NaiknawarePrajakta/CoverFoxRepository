package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		JioCinema  jioCinema = new JioCinema();
		
		JioFiber jioFiber = new JioFiber();
		
		jioCinema.userSetup();//super class property called using sub class object
		
		jioCinema.myCinema();//sub class property called using sub class object
		
		jioFiber.userSetup();//super class property called using sub class object
		
		jioFiber.myPlan();//sub class property called using sub class object
	}

}


