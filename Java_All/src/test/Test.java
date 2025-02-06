package test;

public class Test {
	 //private String s1;
	
	 
	 public static void main(String[] args) {
			/*
			 * Test t1 = new Test(); Test t2 = new Test();
			 * System.out.println(t1.equals(t2));
			 * 
			 */
		//System.out.println( Test.compareValue("30"));
	}
	 
	 public static  void compareValue(String value){
			Integer record = 35;
			boolean flag ;
			try {
				if(record.equals(value))
					flag = true;
				else 
					flag = false;			
		} catch(NullPointerException ex){
			throw ex;
		} catch(Exception ex){
		throw ex;
		}
}
}
