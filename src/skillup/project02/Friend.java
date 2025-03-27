package skillup.project02;

public class Friend {

	String name;
	String phone;
	String addr;

	public Friend() {}
	public Friend(String name, String phone, String addr) {		
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public void showFriendData() {
		System.out.print("이름 : " + name);
		System.out.print(", 전화번호 : " + phone);
		System.out.print(", 주소 : " + addr);
	}
	
}
