package transientKeyword;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	int age;// Now it will not be serialized

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class TransientKeywordExample {
	public static void main(String[] args) throws Exception {
		Student s = new Student(101, "Arbaj", 23);

		FileOutputStream fileOutputStream = new FileOutputStream("f.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(s);
		objectOutputStream.flush();
		objectOutputStream.close();
		fileOutputStream.close();
		System.out.println("success");
	}
}
