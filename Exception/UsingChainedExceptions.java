package Exception;

public class UsingChainedExceptions {
	public static void main(String[] args) {
		try {
			method1();
		}
		catch(Exception exception){  //exception thrown from method1
			exception.printStackTrace();
		}
	}
	
	//call method2; thrown exceptions back in main
	public static void method1() throws Exception {
		try {
			method2();
		}catch(Exception exception) {
			throw new Exception("Exception thrown in method1",exception);
		}
	}
	
	//call method3;thrown exceptions back in method2
	public static void method2() throws Exception {
		try {
			method3();
		}catch(Exception exception) {
			throw new Exception("Exception thrown in method2",exception);
		}
	}
	
	//thrown Exception back to method2
	public static void method3() throws Exception {
		throw new Exception("Exception thrown in method3");
	}
}
