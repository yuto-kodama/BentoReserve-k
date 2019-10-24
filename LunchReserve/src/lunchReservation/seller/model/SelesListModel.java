package lunchReservation.seller.model;

import java.sql.Date;

import lunchReservation.seller.beans.SelesListBeans;
import lunchReservation.seller.dao.SelesListDao;

class SelesListModel {
	
	public SelesListBeans seles(Date searchday) {
		SelesListBeans seleslist=null;
		
		//SelesLisrDaoを呼び出す
		SelesListDao selesDao =new SelesList();
		
		try{
			///////////////////////////////////
			//DBの接続
			
			selesDao.connect();
			
			//ユーザー情報の取得
			seleslist=selesDao.getBy(searchday);
			
		}catch(Exception e) {
			//エラー発生した場合にコンソールにログを出力する
			e.printStackTrace();
		}
		finally {
			//接続（コネクション）を閉じる
			if(selesDao!=null) {
				selesDao.close();
			}
		}
		
		return seleslist;
	}
}
