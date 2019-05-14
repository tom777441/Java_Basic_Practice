package Basic;

public class ObjectTest {
	public static void main(String[] args){
		Object obj1 = new Object();
		String s1 = new String();
		
		/*	Object為String父類別
			自動轉型				*/
		Object obj2 = s1;
		
		/*	強制轉型，可能產生型別轉換錯誤
		String s2 = (String)obj1;
		 */
		
		Object obj3 = new String();
		String s3 = (String)obj3;
	}
}
