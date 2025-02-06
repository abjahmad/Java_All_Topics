package cloneObject;

import java.util.Scanner;
	
/*
 * object cloning is a way to create exact copy of an object
 * 
 * clone() method of Object class is used to clone an object
 * 
 * java.lang.Cloneable interface must be implemented by the class whose object clone we want to create
 * 
 *  If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
 * 
 * clone() method is defined in the Object class.
 * 
 * */


class Employee implements Cloneable // step 1
{
	String name, id;
	
	// Constructor used for loading data
	Employee(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	// Using toString method for display the data
	public String toString() {
		return "Name= "+ name + " Id ="+id; 
	}
	
	// step 2
	public Employee clone() throws CloneNotSupportedException {
		return (Employee)super.clone();
	}
	
}





public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the EmpName:	");
		String name  = scanner.next();
		System.out.println("Enter the EmpId: ");
		String empid = scanner.next();
		Employee  obj1  = new  Employee(name, empid);
		System.out.println("----original Object----");
		System.out.println(obj1);
		System.out.println("hashCode this Object obj1 = "+obj1.hashCode());
				Employee obj2=obj1.clone(); // step 3
				System.out.println("---Display form cloned Object---");
				System.out.println(obj2);
				System.out.println("hashCode of Copy Object obj2 = "+obj2.hashCode());
		
		scanner.close();
	}
}
