package methodsStudy;

public class StudentInfo {

	public static void main(String[] args) {
		
		StudentInfo info= new StudentInfo();
		info.displayInformation();
		info.displayInformation("Test1",10,22.2f,'A',89.9f,true);
		info.displayInformation("Test2",11,23,'C',90,true);
	}
	
	public void displayInformation()
	{
		//name,rollNum,age,div,%marks,result
		
		String name = "Prajakta";
		int rollNum = 45;
		float age = 19.9f;
		char div = 'B';
		float marks = 88.80f;
		boolean result = true;
		
		System.out.println("==============================");
		System.out.println("Student's name is "+name);
		System.out.println("Student's name is "+rollNum);
		System.out.println("Student's name is "+age);
		System.out.println("Student's name is "+div);
		System.out.println("Student's name is "+marks+"%");
		System.out.println("Student's name is "+result);
		
		System.out.println("=================================");
	}

	//String name = "Prajakta";
	//int rollNum = 45;
	//float age = 19.9f;
	//char div = 'B';
	//float marks = 88.80f;
	//boolean result = true;
	
	    //methods with parameters/parameterized method
	   public void displayInformation(String name, int rollNum, float age, char div, float marks, boolean result)
	   {
		   System.out.println("==============================");
			System.out.println("Student's name is "+name);
			System.out.println("Student's name is "+rollNum);
			System.out.println("Student's name is "+age);
			System.out.println("Student's name is "+div);
			System.out.println("Student's name is "+marks);
			System.out.println("Student's name is "+result);
			
			System.out.println("=================================");
	   }
}
 