import java.util.Scanner;

public class Input_ex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,sum;
		
		System.out.print("enter first number:");
		a= input.nextInt();
		System.out.print("enter second number:");
		b= input.nextInt();
		sum= a+b;
		System.out.printf("sum: %d",sum);
		 input.close(); 
	}
}
