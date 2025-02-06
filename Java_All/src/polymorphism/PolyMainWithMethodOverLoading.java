package polymorphism;

/*
 * Polymorphism in java is concept which we can perform one task with multiple ways
 * and they are combination of two word poly means many, and morps means forms.
 * 
 *  there are two types of polymorphism
 *  Compile-time polymorphism and Runtime polymorphism
 *  
 *  Compile-time polymorphism -> A class have multiple method with same name but different different parameter 
 *  there are two ways to method overloading 
 *  1. changing number of arguments
 *  2. changing data types
 *  
 * 
 * 
 * */

class Test {
	//changing number of arguments
	public static int Multiply(int a, int b) {
		return a * b;
	}

	public static int Multiply(int a, int b, int c) {
		return a * b * c;
	}
	
	//  changing data types
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double a, double b) {
		return a+b;
	}

}

public class PolyMainWithMethodOverLoading {
	public static void main(String[] args) {
		System.out.println(Test.Multiply(2, 2));
		System.out.println(Test.Multiply(2, 2, 2));
		System.out.println(Test.add(2, 3));
		System.out.println(Test.add(2.2, 2.2));
	}
}
