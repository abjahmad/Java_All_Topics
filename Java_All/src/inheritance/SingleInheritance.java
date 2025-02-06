package inheritance;

/*
 * Inheritance in Java is a mechanism in which is used to inheriting the all properties from parant class to child class
 * 
 * It is important part of oops 
 * 
 * Inheritance represent IS-A relationship which also known as a Parent-child relationship
 * 
 * Inheritance mainly use for Code Reusability and we can achieved Method Overriding 
 * 
 *   There are Five type of inheritance but java support three types of Inheritance 
 *   Single, Multilevel, hierarchical
 *   
 *   
*/

/*
 * a class inherits another class, it is known as a single inheritance
*/

class A{
	public int sum(int a, int b) {
		System.out.println("This is sum method form A");
		int c;
		return c = a+b;
	}
}

public class SingleInheritance extends A {
     public int sub(int a, int b) {
    	 int c;
		return c= a*b;
     }
     
     public static void main(String[] args) {
		SingleInheritance singleInheritance = new SingleInheritance();
		System.out.println(singleInheritance.sum(2, 2));
		System.out.println(singleInheritance.sub(2, 9));;
	}
}
