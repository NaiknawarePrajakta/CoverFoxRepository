package array;

public class Test {

	public static void main(String[] args) {
		
		// I want to store rollNumber of 5 Students 
		
		//declaration
		int rollNumber[]=new int[5];
		
		//initialization
		rollNumber[0]=10;
		rollNumber[1]=11;
		rollNumber[2]=12;
		rollNumber[3]=13;
		rollNumber[4]=14;
		
		//usage
		//System.out.println(rollNumber[-1]);
		System.out.println(rollNumber[2]);
		System.out.println(rollNumber[4]);
		//System.out.println(rollNumber[5]);
		System.out.println("=======================================");
		
		//I want to store 3 students name
		
		String name[]=new String[3];
		
		name[0]="Prajakta";
		name[1]="Kiran";
		
				
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		
		
  String name1[]=new String[7];
		
		name1[0]="Prajakta";
		name1[1]="Kiran";
		name1[2]="Test";
		name1[3]="Software";
		name1[4]="Velocity";
		name1[5]="Velocity1";
		name1[6]="Velocity2";
				
		
		/*System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		*/
		
		//initialization condition updation
		//0 4 +1
		
		System.out.println("==========static way-forward traversing============= ");
		
		//static way to traversing through array
		
		for(int i=0;i<=6;i++)
		{
			System.out.println(name1[i]);
		}
		
		System.out.println("=========dynamic way-forward traversing =============== ");
		
		//dynamic way to traversing through array
		
		System.out.println(name1.length);
		
		for(int i=0;i<name1.length-1;i++)
		{
			System.out.println(name1[i]);
		}
		
		System.out.println("==========dynamic way-reverse traversing======");
		
		for(int i=name1.length-1;i>=0;i--)
		{
			System.out.println(name1[i]);
		}
		
	}

}
