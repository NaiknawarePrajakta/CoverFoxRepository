package variableTypes;

public class Employee {

	String empName;
	int empId;
	char empGender;
	float empSalary;
	static String country="IND";
	
	public void empInfo()
	{
		System.out.println("Employee name is "+empName);
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee gender is "+empGender);
		System.out.println("Employee Salary is "+empSalary);
		System.out.println("Employee country is "+country);
		
		
		System.out.println("==========================");
		
		
	}
}
