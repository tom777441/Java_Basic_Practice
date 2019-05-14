package Basic;

public class GCTest {
	public static void main(String[] args) {
		GCTest1 obj = new GCTest1();
		//若未設NULL, obj仍有指向GC無法執行
		obj = null;
		//進行GC機制，若未GC則繼續執行 並交給JVM
		System.gc();
	}
}
class GCTest1{
	int a;
	void m1() {};
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Game Over1");
		super.finalize();
		System.out.println("Game Over2");
	}
}
