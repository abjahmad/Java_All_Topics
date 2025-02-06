package logicProgram;

public class Fact {
	public static void main(String gargs []) {
		int fact = 1;
		for(int i =1; i<=5; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
