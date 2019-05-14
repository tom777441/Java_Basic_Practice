package Bike;

public class Bike2Test {
	public static void main(String[] args) {
		Bike2 b2 = new Bike2();
		System.out.println(b2.Speed);
		b2.addSpeed();
		System.out.println(b2.Speed);
		System.out.println(b2.getSpeed());
	}
}
