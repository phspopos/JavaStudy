package ex17collection;

import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet2 {

	public static void main(String[] args) {
		
		HashSet<Teacher> hashSet = new HashSet<Teacher>();
		
		Teacher t1 = new Teacher("정우성", 40, "국어");
		Teacher t2 = new Teacher("황정민", 42, "영어");
		Teacher t3 = new Teacher("최민식", 44, "수학");
		
		hashSet.add(t1);
		hashSet.add(t2);
		hashSet.add(t3);
		
		System.out.println("hashSet의 크기 : " + hashSet.size());
		
		
		
		Teacher t4 = new Teacher("이정재", 40, "국어");
		
		//hashSet.add(t4);
		//Teacher t5 = new Teacher("김하나", 20, "체육");
		
		/*
		if( t1.equals(t4) ) {
			System.out.println("동일하므로");
			
		} else {
			hashSet.add(t4);
		}
		*/
		
		//hashSet.add(t5);
		
		/*
		 Teacher 클래스에 hashCode, equals를 오버라이딩 하지 
		 않으면 동일한 인스턴스인지 판단할 수 없어 정상적으로 입력된다
		 오버라이딩이 제대로 되었다면 추가되지 않는다. 
		 */
		System.out.println("t1Same 저장여부 : " + hashSet.add(t4));
		System.out.println("hashset의 크기 : " + hashSet.size());
		
		Iterator<Teacher>  it = hashSet.iterator();
		
		while( it.hasNext() ) {
			System.out.println( it.next() );
		}
				
		
	}
}
