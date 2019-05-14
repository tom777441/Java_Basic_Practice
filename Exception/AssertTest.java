package Exception;
import java.util.Scanner;

public class AssertTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 to 10:");
		int number = input.nextInt();
		
		//asset that the value is >=0 and <=10 
		//need the set the environment to make assertion effective 
		assert(number>=0 && number<=10):"bad number:" + number;
		
		System.out.printf("You entered %d%n",number);
	}
}
