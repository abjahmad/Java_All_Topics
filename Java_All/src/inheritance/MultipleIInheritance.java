package inheritance;

/*
 * Why multiple inheritance is not supported in java?
 * 
 * Consider a scenario where A, B, and C are three classes. 
 * The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, 
 * there will be ambiguity to call the method of A or B class.
 * Occur runtime error thats the reason.
*/

class A1 {
	void msg() {
		System.out.println("Hello");
	}
}

class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}

/*
 * class C extends A1, B2{
 * 
 * }
 */

/*
 * public class MultipleIInheritance { public static void main(String[] args) {
 * C c = new C(); c.msg();
 * 
 * } }
 */
