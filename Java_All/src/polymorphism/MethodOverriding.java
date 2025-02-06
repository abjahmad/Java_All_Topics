package polymorphism;

/*
 * Method Overriding in Java
 * 
 * A class have same name method with same parameter child class and parent class
 * 
 *  Method overriding is used for runtime polymorphism
 *  
 *  Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).
*/

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {

	void run() {
		System.out.println("bike is running");
	}

}

public class MethodOverriding {
	public static void main(String[] args) {
		Vehicle vehicle = new Bike();
		vehicle.run();
	}
}
