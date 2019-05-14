package Exception;
// throw
public class ExTest5 {
	public static void main(String[] args) {
		Test6 obj = new Test6();
		try {
		obj.m1(-3);
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
class Test6{
	void m1(int b)throws Exception {

		if(b > 0) {
			throw new Ex2();
		}else if(b<0) {
			//throw new Ex1();
		}
	}
}
class Ex1 extends Exception{
	@Override
	public String toString() {
		return "Ex1:.......";
	}
}

class Ex2 extends RuntimeException{
	@Override
	public String toString() {
		//TODO Auto-generated method stub
		return "Ex2:.......";
	}
		
}