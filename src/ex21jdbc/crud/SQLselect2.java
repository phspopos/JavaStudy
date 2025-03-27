package ex21jdbc.crud;

import java.sql.SQLException;

import ex21jdbc.MyConnection;

public class SQLselect2 extends MyConnection {

	public SQLselect2(String user, String pass) {
		super(user, pass);		
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		
		try {
			
			while( true ) {
				
				String sql = "SELECT * FROM member "
						//+ " WHERE name LIKE '%?%'";
						+ " WHERE name LIKE '%'||?||'%'";
				
				psmt = con.prepareStatement(sql);
				psmt.setString( 1, inputValue("찾는이름") );
				
				 while( rs.next() ) {
					 
					 String id = rs.getString(1);
					 String pass = rs.getString(2);
					 String name = rs.getString(3);
					 String regidate = rs.getString(4).substring(0, 10);
					 
					 System.out.printf("%s %s %s %s \n", id, pass, name, regidate );
					 
				 }
				
			}
			
			
		}catch(SQLException e ) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SQLselect2("study", "1234").dbExecute();
	}

}
