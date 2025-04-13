package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.MyConnection;

public class DeleteShop extends MyConnection {

	public DeleteShop(String user, String pass) {
		super(user, pass);
		
	}
	
	@Override
	public void dbExecute() {
		
		try {
			
			csmt = con.prepareCall("{ call ShopDeleteGoods( ?, ? ) }");
			csmt.setInt( 1, Integer.parseInt( inputValue("상품일련번호") ));
			csmt.registerOutParameter( 2, Types.NUMERIC );
			csmt.execute();
			
			int row = csmt.getInt(2);
			
			if( row > 0 ) {
				System.out.println( row + " 행 삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			
		}catch( SQLException e ) {
			e.printStackTrace();
			
		}finally {
			dbClose();
		}
		
	}
	
	public static void main(String[] args) {
		new DeleteShop( "education", "1234" ).dbExecute();
	}	
}
