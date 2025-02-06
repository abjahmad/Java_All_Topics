package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * The reverse operation of serialization is called deserialization where byte-stream is converted into an object
 * 
 * for deserialization we call the readObject() method of ObjectInputStream class.
*/

public class Studetn_De_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 FileInputStream fileInputStream = new FileInputStream("stu.txt");
		 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		   Student student =(Student)objectInputStream.readObject();
		   student.displayName();
		   System.out.println(student.getId());
		   System.out.println(student.getName());
	}
}
