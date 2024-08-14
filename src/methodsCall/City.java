package methodsCall;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To call non static method we need to create object, below is syntax to create object
		//ClassName objectName= new className();
		
		   City pune = new City();//Created pune object
		   // how to call non static method 
		   // objectName.methodName();
		   
		   pune.swargate();//calling non static method from same class 
		   
		   katraj();// calling static method from same class 
		   
		   

	}
	
	public static void katraj() // static method 
	{
		System.out.println("katraj is static method from City class");
	}
	
	public void swargate() //non static method
	{
		System.out.println("swargate is non static method from city class");
		
	
	}
	

}
