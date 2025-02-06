package inheritance;

/*
 * Hierarchical Inheritance Example
 * 
 * two or more classes inherits a single class, it is known as hierarchical inheritance.
*/


class First1{
	void first() {
		System.out.println("this is a first method form First class");
	}
}

class Second2 extends First1 {
	void second() {
		System.out.println("this is a second method from Second class");
	}
}

class Third3 extends First1{
	void third() {
		System.out.println("This is third method from third class");
	}
}


public class HierarchicalInheritance {
	public static void main(String[] args) {
		Third3 third3 = new Third3();
		third3.first();
		third3.third();
	}
}
