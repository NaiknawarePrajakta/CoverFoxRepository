package constructor;

public class CS1 {
  //public CS1()//default constructor
  // {
		//given by compliler --> at the time of compilation 
  // }
	
        public CS1() //user defined --> without parameter/zero parameter constructor
		{
			System.out.println("Without parameter constructor");
		}
		
		public CS1(int a)//user defined -->with parameter /single parameter constructor
		{
			System.out.println("with parameter constructor "+a);
		}
		
		public CS1(String a)// user defined --> with parameter /single parameter constructor
		{
			System.out.println("with parameter constructor "+a);
		}
		
		public CS1(int a,int b)//user defined -->with parameter /two parameter constructor
		{
			System.out.println("with parameter constructor "+a+""+b);
		}
		
		public static void main(String[] args) 
		{
			int a;//variable declaration
			a=10;//variable initialize
			
			CS1 b;//variable declaration
			b= new CS1();//variable initialize
			CS1 c;//variable declaration
			c= new CS1();
			CS1 cs1 = new CS1();//calling without parameter constructor
			CS1 cs2 = new CS1(10);//calling with parameter constructor of int type
			CS1 cs3 = new CS1("velocity");//calling with parameter constructor of string type
			CS1 cs4 = new CS1();//calling without parameter constructor
	}

}
