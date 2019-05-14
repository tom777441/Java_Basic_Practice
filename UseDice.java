import java.util.Random;
public class UseDice {
	public static void main(String[] args) {
		Dice(20);

	}
	//»ë¤l³]­p
	public static void Dice(int roll) {
		Random r = new Random();
		int face;
		for(int count=1;count<=roll;count++) {
		face = 1+r.nextInt(6);
		System.out.printf("%d",face);
		if(count%5 ==0) {
			System.out.println();
			}
		}

	}
}