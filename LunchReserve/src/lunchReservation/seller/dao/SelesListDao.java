package lunchReservation.seller.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lunchReservation.seller.beans.SelesListBeans;

public class SelesListDao extends DaoBase{

	public List<SelesListBeans> getList(Date searchday) {

		//1.DB接続の確認
		if(con==null) {
			//未接続
			return null;
		}
		List<SelesListBeans> list=new ArrayList<SelesListBeans>();

		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
		//2.SQLの発行(SELECT文)
		stmt = con.prepareStatement("ここにSQL文");

		stmt.setDate(1,searchday);
		rs = stmt.executeQuery();

		//3.while文を使って、値の取得をしてbeansに保存
		while( rs.next() ){
			SelesListBeans seleslist = new SelesListBeans();

			seleslist.setSearchday(rs.getDate("course_name"));
			seleslist.setTotalprice(rs.getInt("totalprice"));
			seleslist.setProductcode(rs.getString("product_code"));
			seleslist.setProductname(rs.getString("product_name"));
			seleslist.setNumber(rs.getInt("number"));
			seleslist.setProductprice(rs.getInt("fee"));
			seleslist.setPrice(rs.getInt("price"));

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
