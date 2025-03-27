package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class FriendInfoHandler{
	
	ArrayList<Friend> lists;
	
	public FriendInfoHandler( int num ) {
		lists = new ArrayList<Friend>();
	}
	
	public void addFriend( int choice ) {
		
		Scanner sc = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름 : ");
		iName = sc.nextLine();
		System.out.print("전화번호 : ");
		iPhone = sc.nextLine();
		System.out.print("주소 : ");
		iAddr = sc.nextLine();
		
		if( choice ==  1) {
			System.out.print("별명 : ");
			iNickname = sc.nextLine();
			HighFriend high = new HighFriend( iName, iPhone, iAddr, iNickname );
			lists.add(high);
		
		}else if( choice == 2 ) {
			System.out.print("전공 : ");
			iMajor = sc.nextLine();
			
			lists.add( new UnivFriend( iName, iPhone, iAddr, iMajor ) );
		}
		
		System.out.println("친구정보 입력이 완료 되었습니다.");
				
	}
	
	public void showAllData() {
		for( int i = 0; i < lists.size(); i++ ) {
			lists.get(i).showAllData();
		}
		System.out.println("==전체정보 출력이 되었습니다.");
	}
	
	public void showSimpleData() {
		for( Friend fr : lists ) {
			fr.showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다.==");		
	}
	
	public void searchInfo() {
		
		boolean isFind = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("검사할 이름을 입력하세요 : ");
		String searchName = sc.nextLine();
		
		Iterator<Friend> itr = lists.iterator();
		while( itr.hasNext() ) {
			
			Friend fr = itr.next();
			
			if( searchName.compareTo( fr.name ) == 0 ) {
				fr.showAllData();
				System.out.println("***귀하가 요청하는 정보를 찾았습니다**");
				isFind = true;				
			}
		}
		
		if( isFind == false ) {
			System.out.println("***찾는 정보가 없습니다ㅏ.");
		}
		
	}
	
	public void deleteInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 이름을 입려하세요");
		String deleteName = sc.nextLine();
		
		int deleteIndex = -1;
		for( Friend fr : lists ) {
			if( deleteName.compareTo(fr.name) == 0 ) {
				lists.remove(fr);
				deleteIndex = 1;
				break;
			}
		}
		
		if( deleteIndex == -1 ) {
			System.out.println("==삭데된 데이터가 없습니다==");			
		
		}else {
			System.out.println("==데이터가 삭제되었습니다==");
		}
		
	}
	
	
	
}
	

public class Ex07MyFriendInfoBook {

	public static void menuShow() {
		System.out.println("11######## 메뉴를 입력하세오(ver01) ####### ");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.println("메뉴선택>>>");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while( true ) {
			
			menuShow();
						
			int choice = sc.nextInt();
						
			sc.nextLine();
						
			switch(choice) {
			
			case 1: case 2:				
				handler.addFriend(choice);
				break;
			
			case 3: 
				handler.showAllData();
				break;
				
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
				
			case 6: 
				handler.deleteInfo();
				break;
			
			case 7:
				System.out.println("프로그램종료");
				return;
			}
		}	
	}
	
}
