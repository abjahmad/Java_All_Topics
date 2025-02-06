package interfaceExample;

/*Interface in java
 * 
 * Interface in java is a blueprint of a class
 *  
 * Interface in java  is mechanism  to achieve abstraction they can only contain abstract method
 *  
 * it is used to achieve abstraction and multiple interface in java
 * 
 * java interface also represent  the IS-A-relationship
 * 
 * it can be used achieve looose coupling.
 * 
 * 
*/

public class Main implements Bike {
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
		main.gear();
		main.breaks();
	}

	@Override
	public void start() {
		System.out.println("This is a Start method");
		
	}

	@Override
	public void breaks() {
		System.out.println("this is a breaks method");
		
	}

	@Override
	public void gear() {
		System.out.println("this is a gear method");
		
	}

}
