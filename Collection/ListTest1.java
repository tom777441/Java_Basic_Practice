package Collection;

import java.util.LinkedList;

public class ListTest1 {
	public static void main(String[]args) {
		LinkedList list1 = new LinkedList();
		list1.add("Brad");  //0
		list1.add(12);		//1
		list1.add(true);	//2
		list1.add("Brad");	//3
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println("-----------------------------");
		list1.add(1,"Test1");
		/*
		for(Object obj:list1) {
			System.out.println(obj);
		}*/
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("-----------------------------");
		list1.remove("Brad");  //先刪前面，一次刪一個 也可透過index刪除
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	}
}
