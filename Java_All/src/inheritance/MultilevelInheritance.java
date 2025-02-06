package inheritance;

/*
 * Multilevel Inheritance Example
 * 
 * When there is a chain of inheritance, let see a example i have a  3 class 
 * name A B C and all contain one method with different-different method   
 * and b class extend A class, and c extend b class, 
 * And i create a object C and call all class method  with the  reference C class
 * this is Multilevel inheritance.  
*/

class First{
	void  first(String name) {
		System.out.println("This is a first method from First Class");
	}
}

class Second extends First{
	void second() {
		System.out.println("This is a second method form Second class");
	}
}

class Third extends Second{
	void third() {
		System.out.println("This is third method from third class");
	}
}

public class MultilevelInheritance {
	public static void main(String [] args) {
		Third third = new Third();
		third.first(null);
		third.second();
		third.third();
	}
}
