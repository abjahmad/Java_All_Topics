package customException;

public class HandleException{
	
	public static void main(String[] args) {
		
		try {
			int age = 1;
			if(age<18) {
				throw new AgeNotValidException("Age "+age+" is not posible for voting");
			}else {
				System.out.println("welcome");
			}
		} catch (AgeNotValidException ag) {
			// TODO: handle exception
			System.out.println(ag);
		}
		System.out.println("Execution Complete");
			
	}
}
