import java.util.Random;
//¼Ö³z©â6­Ó¸¹½X
public class Lottery {
	public static void main(String[] args) {
		Random rand= new Random();
		int [] array = new int[42];
		int n=0;
		int tmp=0;
		for(int i=0;i<array.length;i++) {
			array[i]=i+1;
		}
		
		for(int count=0;count<6;count++) {
			n= 1+rand.nextInt(41);
			tmp=array[count];
			array[count]=array[n];
			array[n]=tmp;
		}
			for(int j=0;j<6;j++) {
				System.out.println(array[j]);
			}
	
		
	}
}
