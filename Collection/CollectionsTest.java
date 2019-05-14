package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsTest {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("4");
		list.add("2");
		list.add("1");
		list.add("3");
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("--------------------------------");
		
		//reverse(list):反轉
		//rotate(list,x):x為距離
		//shuffle(list):打亂
		Collections.sort(list);
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
}
