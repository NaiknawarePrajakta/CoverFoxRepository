package variableTypes;

public class HR {

	public static void main(String[] args) {
		
		
		Employee Rohit = new Employee();//created object of employee class
		
		Rohit.empName = "Rohit Sharma";
		Rohit.empId = 45;
		Rohit.empGender = 'M';
		Rohit.empSalary = 1234.12f;
		
		
        Employee Surya = new Employee();//created object of employee class
		
		Surya.empName = "SuryaKumar Yadav";
		Surya.empId = 63;
		Surya.empGender = 'M';
		Surya.empSalary = 1234;
		
		Rohit.empInfo();
		Surya.empInfo();
		
		
	}

}
