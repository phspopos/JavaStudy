package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.MyConnection;

public class UpdateShop extends MyConnection{

	public UpdateShop(String user, String pass) {
		super(user, pass);
		
	}

	@Override
	public void dbExecute() {
		
		try {
			//prepareCall
			/*
			name in varchar2,
	        price in number,
	        code in number,
	        idx in number 
	        */
			
			csmt = con.prepareCall("{ call ShopUpdateGoods( ?, ?, ?, ?, ? ) }");
			csmt.setString( 1, inputValue("상품명") );
			csmt.setInt( 2, Integer.parseInt( inputValue("가격") ));
			csmt.setInt( 3, Integer.parseInt( inputValue("상품코드") ));
			csmt.setInt( 4, Integer.parseInt( inputValue("상품일련번호") ));
			csmt.registerOutParameter( 5, Types.NUMERIC );			
			
			csmt.execute();
			
			int row = csmt.getInt(5);
			
			if( row > 0  ) {
				System.out.println( row+" 행 업데이트 성공" );
			}else {
				System.out.println("업데이트 실패");
			}
		
		}catch( SQLException e ) {
			e.printStackTrace();
		
		}finally {		
			
			dbClose();
		}
		
	}
	
	public static void main(String[] args) {
		new UpdateShop( "education", "1234" ).dbExecute();
	}
	
}
