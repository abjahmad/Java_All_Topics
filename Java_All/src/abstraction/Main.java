package abstraction;
abstract /*
 Abstraction in Java
 
 *Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 *
 *there are two ways to achive abstraction
 *
 *	1. Abstract class (0 to 100%)
	2. Interface (100%)
 *
 *
 *Abstract class In Java
 *
 *A class which is declared abstract keyWord this is known as Astract class
 *and abstrat class can contain abstract and non abstract method 
 *
 *
 */
   class Bike{
	 abstract  void run();
	 void sum() {
		 System.out.println("this is sum method");
	}
}

public  class Main extends Bike {
	
	public static void main(String [] args) {
		Bike bike = new  Main();
		bike.run();
		bike.sum();
		Main main = new Main();
		main.run();
		main.sum();
	}

	@Override
	void run() {
		System.out.println("this is run method from Bike class");
		
	}

}
