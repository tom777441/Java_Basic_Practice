package Bike;

public class Bike {
	//屬性以變數來負責
	double Speed;
	
	//類別成員  static variable
	static int count;
	
	//宣告建構子
	Bike(){
		Speed =7;
		count++;
	}
	//類別成員  static method
	static int getCount(){
		return count;
	}
	
	//方法定義
	void addSpeed() {
		Speed*=1.2;
	}
	void reduceSpeed() {
		Speed*=0.7;
	}
}
