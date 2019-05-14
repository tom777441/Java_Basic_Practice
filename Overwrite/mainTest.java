package Overwrite;

public class mainTest {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		System.out.println(t1.getInt(1));
		System.out.println(t2.getInt("a"));
	}
}
