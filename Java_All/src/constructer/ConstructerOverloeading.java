package constructer;

/*
 * Constructer Overloeading
 * 
 * Constructer overloading in java is a technique of having more than one contructer with different parameter 
 * 
 * 
 * 
 * */


public class ConstructerOverloeading {
	
	int id;
	String name;
	int age;
	
	public ConstructerOverloeading(int i, String s) {
		id =  i;
		name =s;
	}
	
	public ConstructerOverloeading(int i, String n, int a) {
		id=i;
		name=n;
		age=a;
	}
	
	public void dispaly() {
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {
		ConstructerOverloeading overloeading = new ConstructerOverloeading(102,"Arbaj");
		ConstructerOverloeading overloeading2 = new ConstructerOverloeading(103, "Ahmad Arbaj", 22);
		overloeading.dispaly();
		overloeading2.dispaly();
	}
}
