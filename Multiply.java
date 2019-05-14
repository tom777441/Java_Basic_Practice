import java.util.Random;
import java.util.Scanner;
public class Multiply{
  public static void main(String [] args){
    Random r = new Random(); //construct random
    Scanner scanner = new Scanner(System.in);//construct scanner
    int answer=0, correct=0;
    System.out.println("Test starting...");
    for (int count = 1; count <=5; count++){
      int a = r.nextInt(9) + 1;
      int b = r.nextInt(9) + 1;
      System.out.printf("%d x %d = ?\t", a, b);
      answer = scanner.nextInt();
      int key = a*b; 
      if (key == answer){ correct += 1;  }
    }

    if (correct >= 4){ System.out.print("大人"); }
    else if (correct < 3){ System.out.print("小朋友"); }
    
    scanner.close(); 
  }
}
    