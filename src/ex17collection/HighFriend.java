package ex17collection;

public class HighFriend extends Friend {

	public String nickname;	
	
	public HighFriend() {}
	public HighFriend( String name, String phone, String addr, String nickname ) {
		super( name, phone, addr );
		this.nickname = nickname;
	}
	
	@Override
	void showAllData() {
		System.out.println("===고딩친구(전체정보)===");
		System.out.print("이름 : " + name);
		System.out.print(", 전화번호 : " + phone);
		System.out.print(", 주소 : " + addr);
		System.out.println(", 별명 : " + nickname);
	}
	
	@Override	
	void showBasicInfo() {
		System.out.println("===고딩친구===");
		System.out.print("별명 : " + nickname);
		System.out.println(", 전번 : " + phone);
	}
	
}
