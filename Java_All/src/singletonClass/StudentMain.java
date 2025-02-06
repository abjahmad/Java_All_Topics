package singletonClass;

public class StudentMain {
		public static void main(String[] args) {
			Student s1 = Student.getInstance();
			System.out.println(s1.hashCode());
			Student s2 = Student.getInstance();
			System.out.println(s2.hashCode());
		}
}
