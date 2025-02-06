package binding;

/*	
 * Connecting a method call to the method body is known as binding.

   There are two types of binding

    Static Binding (also known as Early Binding).
	Dynamic Binding (also known as Late Binding).
 * 
 * 
 * Static Binding (also known as Early Binding).
 * when type of object is determine at compile time  is known as static binding 
 * 
 * */
public class StaticBinding {

	private void staticBinding() {
		System.out.println("this is a static binding");
	}

	public static void main(String[] args) {
		StaticBinding sb = new StaticBinding();
		sb.staticBinding();
	}
}
