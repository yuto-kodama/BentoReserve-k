package lunchReservation.seller.model;

public class SB2Model {
	
	
	public SB2Beans sb2(String searchday) {
		SB2Beans sb2=null;
		
		//予約Daoを呼び出す
		ReservationDao reservationDao =new ReservationDao();
		
		try {
			//DBへ接続
			reservationDao.connect();
			
			sb2=reservationDao.getBy(searchday);
			
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
		
		return sb2;
	}
}
