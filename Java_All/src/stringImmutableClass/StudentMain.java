package stringImmutableClass;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student("987654321");
		String s = student.getRollNumber();
		System.out.println("Roll Number "+s);
	}

}
