package test.ex17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06HashMapMain {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		int num = 20;
		
		map.put("name", "홍길동");
		map.put("age", String.valueOf(num));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		
		System.out.println("저장된 객체수 : " + map.size());
		
		System.out.println( map.put("name", "최길동") );
		System.out.println("키값으로 중복 저장후 객체수 : " + map.size() );
		
		System.out.println("키값을 알때 "+ map.get("name"));
		
		Set<String> keys = map.keySet();
		for( String key : keys ) {
			String value = map.get(key);
			System.out.println(key + " " + value);
		}
		
		System.out.println("이터레이터 사용하기");
		
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys.iterator();
		while( it.hasNext() ) {
			String key = it.next();
			String value = map.get(key);
			System.out.println( key + " : " + value );
		}
		
		Set<String> keys3 = map.keySet();
		Iterator<String> it4 = keys3.iterator();
		while( it.hasNext() ) {
			String key = it4.next();
			String value = map.get(key);
			
			System.out.println( key + " *** " + value );
		}
		
		
		System.out.println("[vlaue값들만 출력하기]");
		Collection<String> value = map.values();
		for( String a : value ) {
			System.out.println(a);
		}
		
		System.out.println( map.containsKey("name") ? "name키값있다." : "name키값없다." );
		System.out.println( map.containsKey("account") ? "account키값있다" : "accout키값없다");
		System.out.println( map.containsValue("남자") ? "남자있다" : "남자없다" );
		System.out.println( map.containsValue("여자") ? "여자 있다" : "여자 없다" );
		
		System.out.println("삭제된객체 : " + map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		
		Set<String> keys7 =  map.keySet();
		Iterator<String> it3 = keys7.iterator();
		
		while( it3.hasNext() ) {
			String key = it3.next();
			String value2 = map.get(key);
			
			System.out.println( key + " : " + value2 );
		}
		
		map.clear();
		System.out.println("전체삭제후 객체수 : " + map.size());
		
	}
}
