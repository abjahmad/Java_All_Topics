package stringImmutableClass;

/*
 * we have created a final class named Student
   It have one final datamember, 
   a parameterized constructor and getter method.
   
   The above class is immutable because:

	The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
	The class is final so we cannot create the subclass.
	There is no setter methods i.e. we have no option to change the value of the instance variable.
	These points makes this class as immutable
*/
public final class Student {
	final String rollNumber;

	public Student(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getRollNumber() {
		return rollNumber;
	}

}
