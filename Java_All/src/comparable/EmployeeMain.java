package comparable;

import java.util.Arrays;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee [] = {
			new Employee("Arbaj", 25),
			new Employee("raja", 20),
			new Employee("Shabaj", 30)
		};
		Arrays.sort(employee);
		
		for(Employee employee2 :employee) {
			System.out.println(employee2);
		}
	}
}
