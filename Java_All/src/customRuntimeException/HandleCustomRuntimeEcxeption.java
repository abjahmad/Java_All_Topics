package customRuntimeException;

import java.util.Scanner;

public class HandleCustomRuntimeEcxeption {
	
	public static void main(String[] args) {
		System.out.println("type an integer on the console");
		try {
			System.out.println(readFromConsole());
		} catch (CustomRuntimeException e) {
			// TODO: handle exceptions
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
	
	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		 int i =0;
		 try {
			i = sc.nextInt();
		} catch (CustomRuntimeException e) {
				throw new CustomRuntimeException("Invalid", e);
		}catch(Exception exception){
			exception.printStackTrace();
		}
		 return i;
	}

}
