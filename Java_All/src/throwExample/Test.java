package throwExample;

public class Test {
	
	static void checkAge(int age) {
		if(age<18) {
			throw new  ArithmeticException("No You Are not Eligible for vote");
		}else {
			System.out.println("Yes You are Eligible");
		}
	}
	
	public static void main(String [] args) {
		checkAge(2);
	}
	

}
