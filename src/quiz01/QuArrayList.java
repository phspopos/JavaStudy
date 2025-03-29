package quiz01;

import java.util.ArrayList;
import java.util.Scanner;

import common.Student;

/*
컬렉션
※ex17collection 패키지에서 작성하세요.

문제1) QuArrayList.java 
사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 알아내서 
해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 출력하여라.

샘플코드]
public static void main(String[] args) {
	
	//ArrayList<Student> list = new ArrayList<Student>();
	LinkedList<Student> list = new LinkedList<Student>();
	
	//저장할 객체 생성
	Student st1 = new Student("가길동", 10, "2018");
	Student st2 = new Student("나길동", 20, "2017");
	Student st3 = new Student("다길동", 30, "2016");
	Student st4 = new Student("마길동", 40, "2015");
	
	//객체 추가(컬렉션에 저장)
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
		
	//1.검색할 이름을 입력받음
		
	//2.확장for문으로 컬렉션 전체를 접근
		
	//3.검색결과 유/무에 따라 
	//검색결과 있을때…검색된 데이터 삭제
	//검색결과 없을때...검색결과가 없다고 출력

	//4.전체정보 출력
}


실행결과]
검색할 이름을 입력하세요:가길동
[검색되었습니다]
[삭제후 정보출력]
이름:나길동, 나이:20, 학번:2017
이름:다길동, 나이:30, 학번:2016
이름:마길동, 나이:40, 학번:2015

  
 */
public class QuArrayList {	
	
	Scanner sc = new Scanner(System.in);
	
	public QuArrayList() {}
		
	//등록하기
	public void insert( ArrayList<Student> list) {
		
		System.out.println("학생 정보를 입력해 주세요");
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
				  sc.nextLine();
		System.out.print("학번을 입력하세요 : ");
		String stNumber = sc.nextLine();	
		
		Student student = new Student( name, age, stNumber );
		list.add(student);
		
		System.out.println("리스트 사이즈 : " + list.size() );
		System.out.println();
		
	}
	
	//상세보기
	public void showAll( ArrayList<Student> list ) {
		System.out.println("학생정보 상세보기");
		for( Student s : list ) {
			System.out.printf("이름 : %s, 나이 : %d, 학번 : %s \n", s.getName(), s.getAge(), s.getStNumber());
		}
	
		System.out.println();
	}
	
	//검색하기
	public void searchInfo( ArrayList<Student> list ) {
		System.out.println("학생정보 검색하기");
		System.out.print("찾는 이름을 입력하세요 : ");
		String name = sc.nextLine();
		boolean check = false;
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		
		for( int i = 0; i < list.size(); i++ ) {
			
			if( name.equals( list.get(i).getName() ) ) {
				list2.add( (Student)list.get(i) );
				check = true;
			}			
		}	
		
		System.out.println("리스트2 사이지 " + list2.size() );
		
		if( check ) {
			for( int i = 0; i < list2.size(); i++ ) {
				
				String name2 = list2.get(i).getName();
				int age = list2.get(i).getAge();
				String stNumber = list2.get(i).getStNumber();
				
				System.out.printf("이름 : %s, 나이 : %d, 학번 : %s \n", name2, age, stNumber );
			}
		}else {
			System.out.println("찾는 정보가 없습니다.");
		}
	
		System.out.println();
	}
	
	//삭제하기
	public void listRemove( ArrayList<Student> list) {
		
		System.out.println("학생정보 삭제하기");
		System.out.println("삭제할 이름을 입력해 주세요");
		String name = sc.nextLine();
		boolean check = false;
		//사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 알아내서
		//해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 출력하여라.
		//int age = list.indexOf(name);
		
		
		//int age = 0;
		
		//System.out.println( " === "+list.get(2).getName().indexOf("다길동") );
		/*
		for( Student s : list ) {
			int num = s.getName().indexOf(name);
			System.out.println("num = " + num);
			
			if( num == 0  ) {
				System.out.println("들어오나");
				//list.remove(s);
			}
			
		}
		//int age = list.indexOf(name);
		*/
		
		
		
		
		Student s2 = null;
		for( int i = 0; i < list.size(); i++ ) {		 
			
			/*
			if( list.get(i).getName().equals(name) ) {
				System.out.println("====");
			}
			//int a = list.indexOf(); 
			
			//System.out.println("a = " + a);
			*/
			
			if( name.equals( list.get(i).getName() ) ) {
				//list.remove( list.get(i) );
				s2 = (Student)list.get(i);				
				list.remove(i);
				check = true;
				
			}	
		}	
		
		
		if( check ) {
			/*
			for( Student s : list  ) {
				System.out.printf("나이 : %s, 나이 : %d, 학번 : %s \n", s.getName(), s.getAge(), s.getStNumber());
			}
			*/
			
			System.out.printf("나이 : %s, 나이 : %d, 학번 : %s \n", s2.getName(), s2.getAge(), s2.getStNumber());
			
		
		}else {
			System.out.println("삭제된 결과가 없습니다.");
		}
		
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		//LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		//Student st5 = new Student("가길동", 20, "2014");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		//list.add(st5);
		
		for( int i = 0; i < list.size(); i++ ) {
			
			String name = list.get(i).getName();
			int age = list.get(i).getAge();
			String stNumber = list.get(i).getStNumber();
			
			System.out.printf("이름 : %s, 나이 : %d, 학번 : %s \n", name, age, stNumber );
		}
		System.out.println();
		
		QuArrayList qList = new QuArrayList();			
		
		while(true) {
				
			System.out.print("등록 1, 상세보기2, 검색 3, 삭제 4 종료 5 을 눌러주세요 : ");
			
			int num = qList.sc.nextInt();
			qList.sc.nextLine();
			
			if( num == 1 ) {
				qList.insert(list);
				
			}else if( num == 2 ) {
				qList.showAll(list);
				
			}else if( num == 3 ) {
				qList.searchInfo(list);
				
			}else if( num == 4 ) {
				qList.listRemove(list);
				
			}else if( num == 5 ) {
				System.out.println("종료합니다.");
				break;
				
			}else {
				continue;
			}
		
		}
		
	}
}
