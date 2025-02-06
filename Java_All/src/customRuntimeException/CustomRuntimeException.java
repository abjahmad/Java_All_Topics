package customRuntimeException;


public class CustomRuntimeException extends RuntimeException {
		public CustomRuntimeException() {
			super();
		}
		
		CustomRuntimeException(String msg){
			super(msg);
			
		}
	
		CustomRuntimeException(Throwable throwable){
			super(throwable);
			
		}
		
		CustomRuntimeException(String msg, Throwable throwable){
			super(msg, throwable);
		}
}
