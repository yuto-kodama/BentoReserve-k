package lunchReservation.seller.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lunchReservation.seller.beans.ReservationByProductBeans;

public class ReservationDao extends DaoBase{
	
	//商品別予約画面
	public List<ReservationByProductBeans> getList() {
		
		//1.DB接続の確認
		if(con==null) {
			//未接続
			return null;
		}
		
		List<ReservationByProductBeans> list = new ArrayList<ReservationByProductBeans>();

		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
		//2.SQLの発行(SELECT文) 商品コード,商品名,予約数
		stmt = con.prepareStatement("s");
		rs=stmt.executeQuery();

		//3.while文を使って、値の取得をしてbeansに保存
		while(rs.next() ){
			ReservationByProductBeans RPlist = new ReservationByProductBeans();

			RPlist.setProductCode(rs.getString("product_code"));
			RPlist.setProductName(rs.getString("product_name"));
			RPlist.setProductNumber(rs.getInt("number"));
			
			list.add(RPlist);
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
		return list;
	}
}