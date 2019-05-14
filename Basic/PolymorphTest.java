package Basic;

public class PolymorphTest {
	public static void main(String[] args) {
	      Brad b1 = new Brad11();
	/*      b1.m2(); not exist in Brad occur compile error */
	      b1.m1(); //Brad
	   }
	}
	class Brad { void m1(){System.out.println("m1");}}
	class Brad11 extends Brad{
		void m2(){System.out.println("m2");} //
		void m1(){System.out.println("m2");} //overload
	}
