package Star;
import java.util.Scanner;
public class Star{
   public static void main(String args[]){
      int row;
      Scanner input = new Scanner(System.in);
      System.out.print("請問你要印幾行星星(第一行一個、第二行兩個，餘此類推)?");
      row = input.nextInt();
      
      //正三角
      for(int i=1; i<= row; i++){
           for (int j = 1; j <= i; j++){ System.out.print("*"); }
           System.out.println();
      }
      System.out.println("----------------------------------------------");
      
      //倒三角
      for(int i=row; i>= 1; i--){
          for (int j = 1; j <= i; j++){  System.out.print("*"); }
          System.out.println();
        }

      System.out.println("-----------------------------------------------");
      
      //左右反-倒三角
      for(int i=0; i<row; i++){
          for(int j=1; j<=row; j++) {  
                System.out.print(j<=i ? " " : "*"); 
          }
          System.out.println();
    }
      System.out.println("-----------------------------------------------");
      
      //左右反-正三角   
      for(int i=row; i>0; i--){
            for(int j=1; j<=row; j++){System.out.print(j<i ? " " : "*");
            }		
            System.out.println();
      }
      input.close();  }
}
