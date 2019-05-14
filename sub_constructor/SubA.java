package sub_constructor;

public class SubA extends Sup {
	public SubA() {
		methodB();
	}
	public void methodB() {
		System.out.print("from SubA");
	}
}

