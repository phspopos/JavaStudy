package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HRSelected {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";
			
			Connection con = DriverManager.getConnection( url, id, pass );
			
			if( con != null ) {
				
				System.out.println("Oracle 연결성공");
				
				String sql = "SELECT * FROM employees WHERE"
						+ " department_id=50 "
						+" ORDER BY employee_id DESC";
				
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				
				while( rs.next() ) {
					
					String emp_id = rs.getString(1);
					String f_name = rs.getString("first_name");
					String l_name = rs.getString("last_name");
					java.sql.Date h_date = rs.getDate("hire_date");
					int sal = rs.getInt("salary");
					System.out.printf("%s %s %s %s %s %s \n", emp_id, f_name, l_name,h_date, sal );
										
				}
				
				rs.close();
				stmt.close();
				con.close();
				
			}else {
				System.out.println("Oracle 연결실패");
			}
			
		}catch( Exception e ) {
			System.out.println("Oracle 연결시 예외발생");
		}
	}
}
