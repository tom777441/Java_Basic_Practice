package String_application;

public class StringTest {
	public static void main(String[] args) {
		String str1 ="Tom";
		String str2 = new String("TW");
		byte[] b1= {97,98,99,100};
		//byte[],offset,size
		String str3 =new String(b1,0,b1.length);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		
	}
}
