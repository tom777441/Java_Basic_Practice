package Generic;

public class GTest4 {

	public static void main(String[] args) {
		GTest5<B> g1 = new GTest5<B>();
		//g1.m1(new A()); 泛型到B C繼承 故只有A會發生錯誤
		g1.m1(new B());
		g1.m1(new C());
	}
}

class GTest5<T>{
	void m1(T t1) {}
}

class A{}
class B extends A{}
class C extends B{}