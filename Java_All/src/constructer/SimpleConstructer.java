package constructer;

/*
 * Constructer in Java
 * 
 * Constructer in block of code similer to method, it is a special type of method
 * which is used to initialized object 
 * 
 * There are some rules follow before creating constructer
 * 1- Construter must same name as a class name
 * 2- A constructer must have no explicit return type
 * 3- constructer cannot be abstract, final, and synchronized
 * 
 * There are two types of constructer 
 * Non-Parameterrized Constructer 
 * ParameterIzed Constructer
 * 
 *  Non-Parameterrized Constructer -> A constructer dosn`t have any parameter is called Non-Parameterrized Constructer
 *  
 *  ParameterIzed Constructer -> A constructer  which have specific number of parameter is called Parameterrized costructer
 *  
 * 
 * 
 * 
 * */

public class SimpleConstructer {
	public SimpleConstructer() {
		System.out.println("this is from constructer");
	}

	public static void main(String[] args) {
		SimpleConstructer bike = new SimpleConstructer();
	}

}
