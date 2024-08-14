package polyMorphism;


	class Vehicle {
		// defining a method
		void run() {
			System.out.println("Vehicle is moving");
		}
	}
	// Creating a child class
	class Car2 extends Vehicle {
		// defining the same method as in the parent class
		void run() {
			System.out.println("car is running safely");
		}
	}
	public class OverridingPractice{
		public static void main(String args[]) {
			System.out.println("Program Starts");
			Car2 obj = new Car2();// creating object
			obj.run();// 
			Vehicle v = new Vehicle();
			v.run();
			System.out.println("Program Ends");
		}
	}


