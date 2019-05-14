package Collection;

import java.util.HashSet;

public class SetTest1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(12);		//int -->Integer
		set.add("brad");
		set.add(new Integer(12)); //duplication fail
		set.add(true);		//boolean -->Boolean
		set.add("12");		//String
		set.add("brad");	//duplication fail
		
		System.out.println(set.size());
		System.out.println(set.toString());
	}
}
