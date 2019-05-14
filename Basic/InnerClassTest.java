package Basic;

public class InnerClassTest {
	public static void main(String[] args) {
		OutClass.InnerClass obj1 = new OutClass().new InnerClass();
		obj1.m2();
		OutClass.Inner2 obj2 = new OutClass.Inner2();
		obj2.m3();
	}
}
class OutClass{
	int a;
	OutClass(){
		a=100; System.out.println("OutClass");
	}
	void m1(){System.out.println("OutClass:m1()");}
	
	class InnerClass{
		void m2() {System.out.println("InnerClass:m2()");}
		}
	
	static class Inner2{
		void m3() {System.out.println("static:m3()");}
	}
	
}