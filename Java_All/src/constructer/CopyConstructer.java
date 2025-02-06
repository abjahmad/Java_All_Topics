package constructer;

/*
 * Copy Constructer
 * 
 *  Copy Constructer is a special type of construtar, we can copy the value from  one object to another obejct like copy constructer
 *  
*/

public class CopyConstructer {
	
	int id;
	String name;
	
	
	public CopyConstructer(int i, String n) {
		id = i;
		name =n;
	}
	
	public CopyConstructer(CopyConstructer s ) {
		id = s.id;
		name = s.name;
	}
	
	public void dispaly() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		CopyConstructer constructer = new CopyConstructer(1, "Arbaj");
		CopyConstructer constructer2 = new CopyConstructer(constructer);
		constructer.dispaly();
		constructer2.dispaly();
		
	}
}
