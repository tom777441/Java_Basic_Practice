package Basic;

public class AutoBoxingTest {
	public static void main(String[] args) {
		int a=100;
		
		Integer b = new Integer(101);
		
		Integer c=a; //Integer c = new Integer(a);
		System.out.println(c.doubleValue());
		
		int d=b;
		System.out.println(d);
		
		/*
		byte e =12;
		int f = e;     自動轉型
		Integer g = e; 只能在完全相同的包裹類別中進行，故此處會產生error
		*/
	}
}
