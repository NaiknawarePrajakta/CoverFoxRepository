package accessSpecifier;

public class Demo2 {

	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1();
		//demo1.test1(); calling private method in another class is allowed
		
		demo1.test2();//calling default method in another class 
		
		demo1.test3();//calling protected method in another  class
		
		demo1.test4();//calling public method in another class
	}

}
