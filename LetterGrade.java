import java.util.Scanner;
//成績輸入與統計
public class LetterGrade {
	public static void  main(String[] args) {
		int total=0,gradeCounter=0,aCount=0,bCount=0,cCount=0,dCount=0,eCount=0,grade;
		Scanner input = new Scanner(System.in);

		System.out.printf("%s\n%s\n%s\n%s\n",
				"Enter the integer grade in range:0-100",
				"Type the eof indicator to terminate input:",
				"On Unix/Linux/Mac OS X type<CTrl>+d then press Enter",
				"On windows type <Ctrl>+z then press Enter");
		
		//只要輸入還未結束，繼續執行迴圈
		while(input.hasNext()) {
			grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			switch(grade/10) {
			case 9:
			case 10:
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
			default:
				++eCount;
				break;

			}
		}
		
		System.out.println("\n Grade Report:");
		
		if(gradeCounter !=0) {
			double average= (double)total/gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d\n",gradeCounter,total);
			System.out.printf("Class average is %.2f\n",average);
			System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of Students who received each grade:",
					"A:",aCount,
					"B:",bCount,
					"C:",cCount,
					"D:",dCount,
					"E:",eCount);
		}else
			System.out.println("No grade entered!");
		 	input.close(); 
	}
}
