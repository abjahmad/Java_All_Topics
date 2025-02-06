package constructer;

public class ParameterizedConstructer {
	int id;
	String name;
	public ParameterizedConstructer(int id, String name) {
		this.id = id;
		this.name= name;
	}
	
	public void display() {
		System.out.println(id+ "  " +name);
	}
	public static void main(String[] args) {
		ParameterizedConstructer constructer = new ParameterizedConstructer(101, "Arbaj Ahamd");
		constructer.display();
	}
	
}
