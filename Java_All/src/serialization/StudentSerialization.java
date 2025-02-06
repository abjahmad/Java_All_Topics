package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * Serialization in Java is a mechanism of writing the state of an object into a byte-stream
 * 
 * It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
 * 
 * We must have to implement the Serializable interface for serializing the object.
 * 
 * It is mainly used to transfer  object's state on the network and we can store database and file
 * 
 * For serializing the object, we call the writeObject() method of ObjectOutputStream class
 * 
*/

public class StudentSerialization {
	public static void main(String[] args) throws IOException {
		Student student = new Student(101, "Arbaj");
		
		FileOutputStream fileOutputStream = new FileOutputStream("stu.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student);
		fileOutputStream.close();
		objectOutputStream.close();
		System.out.println("Started......");
		
			
	}
}
