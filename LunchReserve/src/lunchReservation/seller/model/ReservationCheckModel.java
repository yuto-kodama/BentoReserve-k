package lunchReservation.seller.model;

import java.util.ArrayList;
import java.util.List;

import lunchReservation.seller.beans.ReservationByProductBeans;
import lunchReservation.seller.dao.ReservationDao;

public class ReservationCheckModel {
	
	
	public List<ReservationByProductBeans> getList(){
		List<ReservationByProductBeans> reservationproductlist=new ArrayList<ReservationByProductBeans>();
		
		//予約Daoを呼び出す
		ReservationDao reservationDao =new ReservationDao();
		
		try {
			//DBへ接続
			reservationDao.connect();
			
			
		}catch(Exception e) {
			//エラー発生時にコンソールログを出力する
			e.printStackTrace();
		}
		finally {
			//接続（コネクション）を閉じる
			if(reservationDao !=null) {
				reservationDao.close();
			}
		}
		
		return reservationproductlist;
	}
}
