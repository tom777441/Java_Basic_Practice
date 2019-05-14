											package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class SetTest2 {
	public static void main(String[] args) {
		//HashSet set = new HashSet(); 非排序
		TreeSet set = new TreeSet();
		
		while(set.size()<6) {
			set.add((int)(Math.random()*49)+1);
		}
		
		
		//System.out.println(set.toString());
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Integer num = (Integer)it.next();
			System.out.println(num);
		}
	}
}
