package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class Ex03ArrayList2 {

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<Student>();
		//ArrayList<Student> list = new ArrayList<Student>();
		
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st2);
		
		System.out.println("[출력1-일반for문]");		
		for( int i = 0; i < list.size(); i++ ) {
			System.out.println( list.get(i) );
		}
		
		boolean removeOk = list.remove(st2);
		System.out.println("인스턴스를 통한 삭제 : " + removeOk );
		
		System.out.println("[출력2-이터레이터]");		
		Iterator<Student> it = list.iterator();
		
		while( it.hasNext() ) {
			System.out.println( it.next() );
		}
		
		int idx = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요");
		String removeName = sc.nextLine();
		
		for( Student s : list ) {
			
			if( removeName.equals( s.getName())) {
				list.remove(s);
				break;
			}			
		}
		
		for( int i = 0; i < list.size(); i++ ) {
			
			Student st = (Student)list.get(i);
			
			System.out.println( st.getName() + " " + st.getAge() + " " + st.getStNumber());
			
		} 
		
		System.out.println("현제 객체수 : " + list.size());
		System.out.println("삭제된 객체의 이름 : " + list.remove(2).getName());
		
		System.out.println("[출력3-확장for문]");
		for( Student s : list ) {
			System.out.println(s);
		}
		
		
		
		
		
		
	}
}
