import java.util.Scanner;
public class Maximumfinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integer:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		double result = maximum(num1,num2,num3);
		System.out.printf("Max:%.2f",result);
		input.close();
	}
		public static double maximum(double x, double y, double z) {
			double maximumValue= x;
			if(y>maximumValue) {
				maximumValue=y;
			}
			if(z>maximumValue) {
				maximumValue=z;
			}
			return maximumValue;
		}
		
	}

