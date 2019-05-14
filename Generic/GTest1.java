package Generic;

//泛型設計
public class GTest1 {

	public static void main(String[] args) {
		GTest2<Integer> g1 = new GTest2<Integer>();
		g1.setT1(12);
		//g1.setT1("String");
		
		GTest2<String> g2 = new GTest2<String>();
		g2.setT1("String");
		//g2.setT1(12)
		
		//程式使用上不安全。
		GTest2 g3 = new GTest2();
		g3.setT1("String");
		g3.setT1(12);
		
	}
}

class GTest2<T>{
	T t1;
	void setT1(T t2) {t1 = t2;}
	T getT1() {return t1;}
}