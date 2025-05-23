package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
  HashMap<K,V>
  -Key, Value의 쌍으로 인스턴스를 저장한다.
  -key값은 중복될수 없다. 만약 중복되면 기존의 데이터를 덮어쓰기한다.
  -key값으로 검색되므로 다른 컬렉션에 비해 속도가 빠르다.
  -저장 순서는 유지되지 않는다.
 */
public class Ex06HashMapMain {

	public static void main(String[] args) {
		
		//Map컬렉션 생성, Key, Value를 모두 String으로 선언
		HashMap<String, String> map = new HashMap<String, String>();
		
		/*
		 객체저장 : 저장시 기존에 저장된 동일한 key 값이 존재하면 저장된
		 인스턴스가 반환된다. 만약 처음이라면 null을 반환한다.
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값 : " + map.put("name","홍길동"));
		
		/*
		  int는 String으로 형변환 할 수 없으므로 타입에러가 발생
		  된다.
		 */
		int number = 20;
		//map.put("age", number);
		//정수는 문자열로 변경한 후 저장할 수 있다.
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		//현재까지 4개의 데이터가 저장됨
		System.out.println("저장된 객체수 : " + map.size());
	
		/*
		 중복저장 : 기존에 입력된 name 이라는 key가 있기때문에
		 '홍길동'이 반환된다. 그리고 기존의 값은 '최길동'으로
		 수정된다.
		 */		
		System.out.println("name이라는 키값으로 저장된 이전의 값 : " + map.put("name", "최길동"));//덮어쓰기
		//기존의 값을 덮어쓰기 하므로 4개가 출력된다.
		System.out.println("키값으로 중복 저장후 객체수 : " + map.size() );
		
		/*
		 출력하기
		  1.키값을 알고있을때 : 
		  1.key값을 알고 있다면 get(key값)으로 출력
		 */
		System.out.println("키 값을 알때 : " + map.get("name") );
		
		/*
		 2.키값을 모를때 
		 */
		/*
		  2. Key값을 모를때 ( 혹은 너무 많아서 명시하기 힘들때)
		  : keySet()을 통해 전체 key를 set으로 얻어온다.
		  이 값을 통해 반복문으로 접근하여 value를 인출할 수 있다.
		 */
		/*
		  3. 이터레이터 사용
		  : 위와 동일하게 KeySet()으로 얻어온 후 반복 출력한다.
		 */
		
				
		
		Set<String> keys = map.keySet();
		
		//이터레이터 인스턴스를 생성		
		System.out.println("[확장for문 적용]");		
		for( String key : keys ) {			
			String value = map.get(key);
			System.out.println( String.format("%s : %s", key, value ));
		}
		
		System.out.println();
		
		/*
		Set<String> keys = map.keySet();
		
		for( String key : keys ){
			String value = map.get(key);
			
			System.out.println( key + " " + value );
			
		}
		
		
		Set<String> keys = map.keySet();
		for( String key : keys ) {
			
			String value = map.get(key);
			System.out.printf(" %s : %s ", key, value );
			
		}
		*/
		
		/*
		Set<String> keys2 = map.keySet();
		
		for( int i = 0; i < keys2.size(); i++ ) {
			
			String value = (String)map.get(keys2.toString());
			
			System.out.println( keys2 + " === " + value);
		}
		*/
		
		/*
		 3.이터레이터를 통한 출력 
		 */
		/*
		System.out.println("[이터레이터 사용하기]");
		// Map의 전체 key를 얻어온 후..
		Set<String> keys2 = map.keySet();
		//key가 있는 지 확인후 ...
		Iterator<String> it = keys2.iterator();
		
		while( it.hasNext() ) {
			//존재하면 key를 얻어와서 value를 인출한다.
			String value = map.get(key);
			System.out.println(String.format("%s : %s", key, value));
		}
		
		
		Set<String> key2 = map.keySet();
		Iterator<String> it = key2.iterator();
		
		while( it.hasNext() ) {
			
			String key = it.next();
			String value = map.get(key);
			System.out.println( key + " : " + value );
		}
		*/
		
		Set<String> key2 = map.keySet();
		Iterator<String> it = key2.iterator();
		while( it.hasNext() ) {
			String key = it.next();
			String value = map.get(key);
			
			System.out.println( key +" ::: " + value);
		}
		
		/*
		 Value만 얻어와야 할때 : 메서드를 통해 값만 얻어올 수 있다. 컬렉션의
		 형태로 얻어온 후 반복해서 출력한다.
		 */
		/*
		System.out.println("[value값들만 출력하기]");
		Collection<String> values = map.values();
		
		for( String value : values ) {
			System.out.println(value);
		} 
		*/
		
		Collection<String> values = map.values();
		
		for( String a : values ) {
			System.out.println(" 값 : " + a );
		}
		
		
		/*
		 존재유무확인 : Map은 key와 value가 있으므로 메서드도 2개로 나눠져
		 있다.
		 */
		
		System.out.println( map.containsKey("name") ? "name키값있다" : "name키값없다" );
		System.out.println( map.containsKey("account") ? "account키값있다" : "accoutn키값없다" );
		System.out.println( map.containsValue("남자") ? "남자 있다" : "남자 없다");
		System.out.println( map.containsValue("여자") ? "여자 있다" : "여자 없다" );
		
		/*
		 삭제 : key를 통해 삭제하고, 삭제에 성공하는 해당
		 value 가 반환된다.
		 */
		System.out.println("삭제된객체 : " + map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		for( String key : keys ) {
			System.out.println( String.format("%s : %s", key, map.get(key)));
		}
		
		/*
		 전체삭제 : removeAll()은 없고, clear만 사용할 수 있다.
		 */
		map.clear();
		System.out.println("전체삭제후 객채수 : " + map.size());
		
		
		
		
		
	}
}
