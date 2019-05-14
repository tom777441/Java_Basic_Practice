import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
		double height,weight,bmi;

 		Scanner input = new Scanner(System.in);
		System.out.print("height:");
		height = input.nextDouble();
		System.out.print("weight:");
		weight = input.nextInt();
		bmi=weight/(height*height);
		System.out.printf("bmi:%f",bmi);
		
		 input.close(); 
	}
}
