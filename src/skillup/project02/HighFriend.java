package skillup.project02;

public class HighFriend extends Friend{
	
	public String nickname;	
		 
	public HighFriend() {}
	public HighFriend( String name, String phone, String addr, String nickname ) {
	
		super( name, phone, addr);	
		this.nickname = nickname;
	}
		
	void showAllData() {
		
		System.out.println("===고딩친구(전체정보)===");
		super.showFriendData();
		System.out.println(", 별명 : " + nickname);
		
	}
		
	void showBasicInfo() {
		System.out.println("===고딩친구===");
		System.out.print("별명 : " + nickname);
		System.out.println(", 전번 : " + phone);
	}
	
}
