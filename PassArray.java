
public class PassArray {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		
		System.out.println("Effects of passing reference to entire array \n"
		+"The values of original array:");
		
		for(int value:array) {
			System.out.printf("%5d",value);
		}
			modifyArray(array);
			System.out.println("\n\nThe values of the modified array:");
			
			for(int value:array) {
				System.out.printf("%5d",value);
		}
		
	}
	public static void modifyArray(int[] array2) {
		for(int counter=0;counter<array2.length;counter++) {
			array2[counter]*= 2;
		}
	}
}
