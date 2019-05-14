package sub_constructor;

public class SubB extends Sup {
	public SubB() {
		methodB();
	}
	public void methodB() {
		System.out.print("from SubB");
	}
}
