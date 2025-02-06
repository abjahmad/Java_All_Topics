package stringLogical;

public class ReverseString {
	public static void main(String [] args) {
		String s = "Arbaj Ahmad";
		char [] ch = s.toCharArray();
		for(int i = ch.length-1; i>=0; i--)
			System.out.println(ch[i]);
		
		
		for(int i = s.length()-1; i>=0; i--) {
System.out.println(s.charAt(i));			
		}
	}
	

}
