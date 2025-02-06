package binding;

/*
 * when type of object is determined at run time , is known as dynamic binding
 * 
 * 
 * */

class Sample {
	void sample() {
		System.out.println("this is a sample method from Sample class");
	}
}

public class DynamicBinding extends Sample {

	void sample() {
		System.out.println("this is a sample method from DynamicBinding class");
	}
	
	public static void main(String[] args) {
		Sample s = new DynamicBinding();
		s.sample();
		
	}

}
