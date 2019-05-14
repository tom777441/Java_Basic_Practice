package Overwrite;

public class Test1{
	int getInt(int a){
		System.out.println("Test1: getInt()");
		return 1;
	}
	
	/*ÂÐ¸ü*/
	void eat(int a) {}
	void eat(int a,int b) {}
	void eat(String c) {}
}
