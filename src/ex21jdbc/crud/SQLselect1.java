package ex21jdbc.crud;

import java.sql.SQLException;

import ex21jdbc.MyConnection;

public class SQLselect1 extends MyConnection {

	public SQLselect1(String user, String pass) {
		super(user, pass);		
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		
		try {
			stmt = con.createStatement();
			String query = "SELECT id, pass, name, regidate,"
					+" to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 "
					+" FROM member";
			
			rs = stmt.executeQuery(query);
			
			while( rs.next() ) {
				String id = rs.getString(1);
				String pw = rs.getString("pass");
				String name = rs.getString("name");
				
				java.sql.Date regidate = rs.getDate("regidate");
				String regidate2 = rs.getString("regidate");
				String regidate3 = rs.getString("regidate").substring( 0, 13 );
				String regidate4 = rs.getString("d1");
				
				System.out.printf("%s %s %s %s %s %s %s \n", id, pw, name, regidate, regidate2, regidate3, regidate4 );
			}			
			
			
			
		}catch( SQLException e ) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new SQLselect1( "study", "1234" ).dbExecute();
	}

}
