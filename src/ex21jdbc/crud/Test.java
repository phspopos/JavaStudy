package ex21jdbc.crud;

import ex21jdbc.MyConnection;

public class Test extends MyConnection {

	public Test(String user, String pass) {
		super(user, pass);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Test t = new Test("hr","1234");
		
		String s = t.inputValue("제목");
		System.out.println(" 입력 : "+ s );
		
		t.dbClose();
	}
}
