package Exception;
//Exception runtime
public class ExTest4 {
	public static void main(String[] args) {
		int a=0,b=10;
		int c;
		int[] d= new int[4]; //{0,0,0,0}
		try {
		c = b/a;
		d[4]=123;
		System.out.println("A");
		}catch(ArithmeticException ee) {
			System.out.println("C");
		}catch(RuntimeException aa) {
			System.out.println("B");
		}
	}
}
