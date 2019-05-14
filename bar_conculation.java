import java.util.Scanner;
/*n!的右邊取0位置*/
public class bar_conculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入任意正整數:");
		int i = input.nextInt();
		int c=1,tmp;
		System.out.println("其乘階為:"+bar(i));
		tmp=bar(i);
		while(tmp%10 ==0){
			c++;
			tmp/=10;
		}
		System.out.printf("%d",c);
		
	}
	
	  static int bar(int i){
		if(i==1) {
			return 1;
		}
		else {
			return i*bar(i-1);
		}
	}
	 
	
}

