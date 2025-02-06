package string;

public class StringExample {
	public static void main(String[] args) {
		String s1= "Arbaj Ahamd";
		char [] ch = {'a','r','b'};
		String s2 =  new String(ch);
		String s3 = new String("Arbaj Ahmad");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
	}
}
