package accessSpecifier1;

import accessSpecifier.Demo1;

public class Demo3 extends Demo1{
	
	public static void main(String[] args) {
		
		Demo1 demo1=new Demo1();
		//demo1.test1();//calling private method in another package  is not allowed 
		//demo1.test2();//calling default method in another package is not allowed
		
		//demo1.test3();
		
		demo1.test4();//calling public method in another package
		
		Demo3 demo3=new Demo3();
		demo3.test3();//calling protected method from another package 
		//we have to inheritance concept --> call using child class object
		
	}

}
