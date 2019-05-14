
public class Judge {
	public static void main(String[] args) {
		String birthday="true";
		int age=64;
		// |和||幾乎相同，但||在左邊運算式成立時就會執行結果，即減少計算提高執行效率
		if(birthday=="true"|age++==66) {
			System.out.print("yes");
		}else
			System.out.print("no");
	}
}
