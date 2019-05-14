import java.util.Scanner;

public class FoodSurvey2{
  public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   int response=0, counter = 0, r1=0, r2=0, r3=0,flag=0;
   flag = input.nextInt();
   while (flag != -1){       
     System.out.print("臭豆腐輸入1,蚵仔煎輸入2,滷味輸入3(共計5輪):"); 
     response = input.nextInt();
     if (response == 1){ r1++ ;}
     else if (response == 2){ r2++;}
     else if (response == 3){ r3++;}  
     counter++;
     flag = input.nextInt();
   }
  System.out.println("臭豆腐人數 " + r1 + "\n(2)蚵仔煎人數" + r2 + "\n(3)滷味人數" + r3);
  System.out.println("投票人數 " + counter);

  System.out.printf("臭豆腐比率 %.2f",(counter !=0 ? (double)r1/counter : 0)); //成立r/counter不成立0
  System.out.printf("\n蚵仔煎比率 %.2f",(counter !=0 ? (double)r2/counter : 0));
  System.out.printf("\n滷味比率: %.2f",(counter !=0 ? (double)r3/counter : 0));
  
  input.close(); 
  }
}
