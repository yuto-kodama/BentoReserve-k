package lunchReservation.seller.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lunchReservation.seller.beans.SelesListBeans;

public class SelesListDao extends DaoBase{
	
	public SelesListBeans getBy(Date searchday) {
		
		//1.DB接続の確認
		if(con==null) {
			//未接続
			return null;
		}
		SelesListBeans seleslist = null;

		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
		//2.SQLの発行(SELECT文)
		stmt = con.prepareStatement("ここにSQL文");

		stmt.setDate(1,searchday);
		rs = stmt.executeQuery();

		//3.while文を使って、値の取得をしてbeansに保存
		while( rs.next() ){
			seleslist = new SelesListBeans();

			seleslist.setSearchday(rs.getDate("course_name"));

		}
		}catch(SQLException e) {
			//エラー発生した場合にコンソールにログを出力する
			e.printStackTrace();
		}
		
		finally {
	    	try {
		        // 接続を閉じる
	        	if( rs != null ){
					rs.close();
	        	}
	        	if( stmt != null ){
	        		stmt.close();
	        	}
			} catch (SQLException e) {
				System.out.println("closeに失敗しました");
				;	//closeの失敗は無視
			}
		}
		return loginInfo;
		}
	}

}
}
