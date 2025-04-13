package ex21jdbc.shopping;

import java.sql.SQLException;

import ex21jdbc.MyConnection;

public class InsertShop extends MyConnection{

	public InsertShop(String user, String pass) {
		super(user, pass);
		
	}
	
	@Override
	public void dbExecute() {
		
		try {
		/*
			 ▶ 상품입력
		PreparedStatement객체를 사용하여 작성한다.
		클래스명 : ex21jdbc.shopping.InsertShop
		상품명, 상품가격, 상품코드를 scanValue() 메소드로 입력받아 사용한다. 
		입력이 완료되면 입력된 행의 갯수를 반환하여 출력한다. 
 
 	
 	
	g_idx number primary key,
	goods_name varchar2(100),
	goods_price number,
	regidate date,
	p_code number	 
		*/			
			String sql = "";
			int result = 0;
			
			sql = "insert into sh_goods values( ?, ?, ?, sysdate, ? )";
			psmt = con.prepareStatement(sql);
			
			psmt.setInt( 1, Integer.parseInt( inputValue("상품코드") ) );
			psmt.setString( 2, inputValue("상품명") );
			psmt.setInt( 3, Integer.parseInt( inputValue("상품가격") ) );
			psmt.setInt( 4, Integer.parseInt( inputValue("상품코드") ) );
			
			result = psmt.executeUpdate();
			
			if( result > 0 ) {
				System.out.println( result + " : 행 입력성공 ");
			}else {
				System.out.println("입력실패");
			}
						
			
		}catch( SQLException e ) {
			e.printStackTrace();
		}finally {
			dbClose();
		}		
		
	}
	
	public static void main(String[] args) {
		new InsertShop( "education","1234" ).dbExecute();
	}
	
}
