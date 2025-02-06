package exception;

public class Main {
	
	/*
	 * Exception is an abnormal condition
	 * 
	 * An Exception is an event that disrupt the normal flow of the program. It is an object that thorw at runtime
	 * 
	 * Exception Handling -> Exception handling is a mechanism to handle errors such as ClassNotFoundException, IOException, SQLException etc. 
	 * 
	 *  There are two types of Exception 
	 *  
	 *  1. Checked Exception
	 *  2. UnChecked Exception
	 *  
	 *  1. Checked Exception - the class that directly inherited The Throwable class is known as checked exception 
	 *  						checked exception are checked at compile time 
	 *  					Ex. - IOException, SQLException. 
	 *  
	 *   2. UnChecked Exception - The class that inherit the runtime exception are known as unchecked excepption 
	 *   							Unchecked exception are not cheked at compile time but they are checked rumtime.
	 *   					Ex. - ArithmaticException, NullPoiterException, ArrayIndexOutOfBoundException
	 *   
	 */
	
	public static void main(String[] args) {
		
		try {
		
		int data = 100/0;
	
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("-----");
	}
}
