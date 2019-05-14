package String_application;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.toString());
		sb1.append("TOM");
		System.out.println(sb1.toString());
		sb1.append(" RADIO");
		System.out.println(sb1.toString());
		sb1.reverse();
		System.out.println(sb1.toString());
	}
}
