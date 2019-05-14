package Exception;

public class UsingExcepitons2 {
	public static void main(String[] args) {
		try {
			throwException();
		}catch(Exception exception){      //exception thrown by throwException
			System.err.println("Exception handled in main");
		}
		
		doesNotThrowException();
	}
	
	//demostrate try...catch..finally
	public static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}catch(Exception exception){      //generate exception
			System.err.println(
					"Exception handled in method throwException");
			throw exception;              //rethrow for further processing
		}finally {
			System.err.println("Finally executed in throwException");
		}
	}
	
	//demostrate finally when no exception occurs
	public static void doesNotThrowException() {
		try {
			System.out.println("Method doesNotException");
		}catch(Exception exception) {         //doesn't execute
			System.err.println(exception);
		}finally {							  //executes regardless of what occurs in try...catch
			System.err.println("Finally executed in doesNotThrowException");
		}
		
		System.out.println("End of method doesNotThrowException");
	}
}
