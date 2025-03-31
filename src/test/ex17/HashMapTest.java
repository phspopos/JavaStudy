package test.ex17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		int num = 20;
		
		map.put("name", "홍길동");
		map.put("age", String.valueOf(num));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while( it.hasNext() ) {
			//System.out.println( it.next() );
			String key = it.next();
			String value = map.get(key);
			
			System.out.println( key + " : " + value );
		}
		
		
	}
}
