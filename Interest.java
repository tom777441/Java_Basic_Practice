
public class Interest {
	public static void main(String[] args) {
		
		double amount;
		double principal = 1000.0;
		double rate =0.05;
		System.out.printf("%s %20s\n","Year","Amount on deposit"); 
		//%20s 但"Amount....t"字串只有17剩餘轉換空白
		for(int year=1;year<=10;year++) {
			amount = principal *Math.pow(1.0+rate,year );
			System.out.printf("%4d%,20.2f\n",year,amount);
			//空4行執行第一個%d 然後空20行執行第2個%d並取小數點後2位
		}
	}
}
