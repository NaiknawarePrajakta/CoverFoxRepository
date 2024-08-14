package constructor;

public class CS4_Practice {
	
	public  CS4_Practice()
	{
		System.out.println("without parameter");
	}
	 public CS4_Practice(int p)
	 {
		 System.out.println("with parameter "+p);
	 }
	 
	 public CS4_Practice(int a,int c) {
		 System.out.println("with two parameter "+a+" " +c);
	 }

	public static void main(String[] args) {
		
		CS4_Practice c=new CS4_Practice();
		CS4_Practice c1=new CS4_Practice(50);
		CS4_Practice c2=new CS4_Practice(14, 15);

		
	}

}
