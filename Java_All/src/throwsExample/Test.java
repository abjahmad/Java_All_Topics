package throwsExample;

public class Test {
		static void devide(int a, int b)throws ArithmeticException {
			if(b==0) {
				throw new ArithmeticException("cannot devide by zero");
			}else {
				System.out.println(a/b);
			}
		}
		
		public static void main(String[] args) {
			devide(10, 2);
		}
}
