package casting;

public class ClassCasting {

	public static void main(String[] args) {
		
		Father f= new Father();
		f.car();
		f.bike();
		System.out.println("========================");
		
		Son s= new Son();
		
		s.car();
		s.bike();
		s.laptop();
		System.out.println("=========");
		
		Father f1=new Son();
		f1.car();
		f1.bike();
	    //f1.laptop();
	}

}
