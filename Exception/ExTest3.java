package Exception;
//Exception check
public class ExTest3 {
	public static void main(String[] args) {
		ExTest31 obj = new ExTest31();
		try {
			obj.m1(4);
		}catch(Exception ee) {
		
		}
	}
}
class ExTest31{
	//defined and judge whether throw Exception
	void m1(int b) throws Exception{
		int a =b;
		if(a<4) {
		throw new Exception();
		}
	}

}