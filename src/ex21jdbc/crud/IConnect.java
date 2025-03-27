package ex21jdbc.crud;

public interface IConnect {
	String ORACLE_DRIVER = "oracle.jdbc.oracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	void dbExecute();
	void dbClose();
	String inputValue(String title);
	
}
