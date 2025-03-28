package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Ex03ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		//LinkedList<String> list = new LinkedList<String>();
		//Vector<String> list = new Vector<String>();
		
		/*
		  객체저장
		 */
		
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add("워너원");
		list.add("소방차ㅋㅋ");
		list.add( list.size(), "오마이걸" );
		list.add( list.size(), "방탄소년단" );
		System.out.println("중복 저장전 객채수 : " + list.size());
		
		/*
		  중복저장
		 */
		System.out.println(list.add("트와이스") ? "중복저장됨" : "중복저장안됨");
		System.out.println("중복 저장후 객채수 : " + list.size());
		
		/*
		  출력하기
		 */
		System.out.println("\n[일반for문 사용]");
		for( int i = 0; i < list.size(); i++ ) {
			System.out.print( list.get(i) + " " );
		}
		
		System.out.println("\n[확장for문 사용]");
		
		for( String s : list ) {
			System.out.print( s + " ");
		}
		
		/*
		  Iterator 사용법
		 */
		System.out.println("\n[반복자(Iterator) 사용]");
		
		Iterator<String> it = list.iterator();
		
		while( it.hasNext() ) {
			System.out.print( it.next() + " " );
		}
		
		System.out.println("\n================\n");
		
		/*
		  덮어쓰기
		 */
		
		list.set(4, "오마이걸>덮어쓰기");
		
		for( String s : list ) {
			System.out.print( s + " " );
		}
		System.out.println("\n==================\n");
		
		/*
		  삽입하기(끼워넣기)
		 */
		list.add( 4, "블랙핑크>삽입하기");
		
		for( String s : list ) {
			System.out.print( s + " ");
		}
		System.out.println("\n==================\n");
		
		/*
		  포함여부확인
		 */
		System.out.println( list.contains("빅뱅") ? "빅뱅있음" : "빅뱅없음" );
		System.out.println( list.contains("블랙핑크") ? "블랙핑크있음" : "블랙핑크없음");
		
		/*
		  삭제방법1
		 */
		
		Object obj = list.remove(2);
		System.out.println("삭제된 객체 : " + obj);
		
		/*
		  방법2
		 */
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index = " + index);
		Object obj2 = list.remove(index);
		System.out.println("삭제된 객체 : " + obj2);
				
		/*
		  방법3
		 */
		
		System.out.println( list.remove("방탄소년단") ? "삭제성공(방탄)" : "삭제실패(방탄)");
		System.out.println( list.remove("오마이걸") ? "삭제성공(마이걸)" : "삭제실패(마이걸)" );
		System.out.println("삭제후 출력");
		
		for( String s : list ) {
			System.out.print( s + " ");
		}
		System.out.println();
		
		/*
		  전체삭제
		 */
		
		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제후 객체수 : " + list.size() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
