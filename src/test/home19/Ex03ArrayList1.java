package test.home19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Ex03ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//LinkedList<String> list = new LinkedList<String>();
		//Vector<String> list = new Vector<String>();
	
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add("워너원");
		list.add("소방차ㅋㅋ");
		list.add( list.size(), "오마이걸");
		list.add( list.size(), "방탄소년단");
		System.out.println("중복 저장전 객체수 : " + list.size() );
		
		System.out.println( list.add("트와이스") ? "중복저장됨" : "중복저장안됨" );
		System.out.println("중복 저장후 객체수 : " + list.size() );
		
		System.out.println("\n[일반 for문 사용]");
		for( int i = 0; i < list.size(); i++ ) {
			System.out.print( list.get(i) + " ");
			
		}
		System.out.println();
		System.out.println("\n[확장 for문 사용]");
		for( String s : list ) {
			System.out.print( s +" " );
		}
		
		System.out.println();
		System.out.println("\n[반복자(Iterator)사용 ]");
		
		Iterator<String> it = list.iterator();
		while( it.hasNext() ) {
			System.out.print( it.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		list.set(4, "오마이걸>덮어쓰기");
		for( Object o : list ) {
			System.out.print( o + " " );
		}
		System.out.println();
				
		list.add(4, "블랙핑크>삽입하기");
		
		for( Object o : list ) {
			System.out.print( o + " ");
		}		
		System.out.println();
		
		System.out.println( list.contains("빅뱅") ? "빅뱅 있음" : "빅뱅 없음" );
		System.out.println( list.contains("블랙핑크") ? "블랙핑크 있음" : "블랙핑크 없음");
		
		Object obj = list.remove(2);
		System.out.println("삭제된 객체 " + obj );
		
		int index = list.indexOf("빅뱅");		
		System.out.println("index = " + index);
		list.remove(index);
		
		System.out.println( list.remove("방탄소년단") ? "삭제성공(방탄)" : "삭제실패(방탄)");
		System.out.println( list.remove("오마이걸") ? "삭제성공(마이걸)" : "삭제실패(마이걸)");
		System.out.println("삭제후 출력");
		for( String s : list ) {
			System.out.print( s + " ");
		} 
		System.out.println();
		int num = list.indexOf("트와이스");
		System.out.println("num = " + num);
		
		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제후 객체수 : " + list.size());
		
	}
}
