package skillup.project03;

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
	// 멤버변수 출력용 메서드
	public void showAllData() {
		System.out.print("이름 : " + name);
		System.out.print(", 전화번호 : " + phone);
		System.out.print(", 주소 : " + addr);
	}
	
	//오버라이딩을 목적으로 정의한 메서드
	public void showBasicInfo() {}
	
}
