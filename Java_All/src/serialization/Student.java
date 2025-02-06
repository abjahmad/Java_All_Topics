package serialization;

import java.io.Serializable;


/*
 * We must have to implement the Serializable interface for serializing the object.
 * 
 * Serializable is a marker interface (has no data member and method).
 * 
 * It is used to "mark" Java classes so that the objects of these classes may get a certain capability
*/

public class Student implements Serializable{
	private int id;
	private  transient String name;
	
	 Student() {
		
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public void displayName() {
		System.out.println("My name id "+this.name);
	}
	
}
