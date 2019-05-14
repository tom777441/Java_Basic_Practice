package Collection;
import java.util.*;
public class MapTest1 {
	
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put(1,"Brad1" );
		map1.put("1","Brad2" );
		map1.put(new Integer(1),"Brad3" ); //把index=1蓋掉
		
		System.out.println(map1.size());	
		System.out.println(map1.get(1));
		System.out.println(map1.get("1"));
	}
}
