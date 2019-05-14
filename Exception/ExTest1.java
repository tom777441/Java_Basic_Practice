package Exception;

public class ExTest1 {
	public static void main(String[] args) {
		int a=0,b=10;
		try {
			//可能發生例外
			System.out.println(b/a);
		}	//捕捉發生例外
		catch(Exception e) {
			System.err.println("can't computing");
		}	//確保try---catch程式執行完整度
		finally {
			System.out.println("Game Over");
		}
		System.out.println("Game Over 2");
	}
}
