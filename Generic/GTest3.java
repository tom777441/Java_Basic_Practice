package Generic;

import java.util.HashSet;

public class GTest3 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		for(Integer i :set) {
			System.out.println(i);
		}
	}
}
