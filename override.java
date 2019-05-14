
public class override {
	public static void main(String[] args) {
		int a = 5, b = 2;
		System.out.println(a/b); 
		System.out.println((double) a/b);

		double d = 0.0;
		d = a/b;   //What is d¡¦s value?
		System.out.println(d);
		d = (double) 5/2; //What is d¡¦s value now?
		System.out.println(d);

		double a1 = 5.0;
		d = a1/b; //What is d¡¦s value now?
		System.out.println(d);
		
		int y = 2 * 5 * 5 + 3 * 5 + 7;
		System.out.print(y);
	}
}
