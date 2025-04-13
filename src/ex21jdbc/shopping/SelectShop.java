package ex21jdbc.shopping;

import java.sql.SQLException;
import java.text.Format;

import ex21jdbc.MyConnection;

public class SelectShop extends MyConnection{

	public SelectShop(String user, String pass) {
		super(user, pass);
		
	}
	
	@Override
	public void dbExecute() {
		
		try {
			
			String sql = "";
			int resutl = 0;
			
			/*
			 g_idx number primary key,
			goods_name varchar2(100),
			goods_price number,
			regidate date,
			p_code number			  
			 */
			sql = "select g_idx, goods_name, to_char( goods_price, '999,999' ) as goods_price, "
					+ " to_char( regidate, 'yyyy-mm-dd hh24:mi') as regidate , p_code from sh_goods "
					+ " where goods_name like '%"+inputValue("제품명")+"%'";
			
			System.out.println(sql);
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while( rs.next() ) {
				
				int g_idx = rs.getInt("g_idx");
				String goods_name = rs.getString("goods_name");
				String goods_price = rs.getString("goods_price");
				String regidate = rs.getString("regidate");
				int p_code = rs.getInt("p_code");
				
				System.out.printf(" %d %s %s %s %d \n", g_idx, goods_name, goods_price, regidate, p_code );
				
			}
			
			
		}catch(SQLException e ) {
			e.printStackTrace();
			
		}finally {
			dbClose();
		}
		
	}
	
	public static void main(String[] args) {
		new SelectShop( "education", "1234" ).dbExecute();
	}
	

}
