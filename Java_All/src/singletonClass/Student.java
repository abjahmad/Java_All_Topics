package singletonClass;

import java.io.Serializable;

/*Singleton design pattern 
 * 
 * Single Design pattern is a Creational design pattern in java 
 * which is use to ensure that class olny one instance 
 * and provide a global point of acccess  whole our application.
 * 
 * use of Single Design Pattern 
 *  -for global access
 *  -forsingle instance
 *  -thread safety
 *  -lazy loading
 *  
 *How to make singleton class
 * 
 *  -to make constructor are private
 *  -write a static method
 * 
 * */

public class Student {

	// initialized variable with static
	public static  Student s;

	// make private Constructor for create a object
	private Student() {

	}

	// create static method and return the object
	public static Student getInstance() {
		if (s == null) {
			s = new Student();
		}
		return s;
	}

}
