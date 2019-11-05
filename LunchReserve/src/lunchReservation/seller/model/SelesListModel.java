package lunchReservation.seller.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import lunchReservation.seller.beans.SelesListBeans;
import lunchReservation.seller.beans.SelesdayBeans;
import lunchReservation.seller.dao.SelesListDao;

public class SelesListModel {

	public SelesdayBeans days(Date searchday) {
		SelesdayBeans dayInfo=null;
		//SelesLisrDaoを呼び出す
				SelesListDao selesDao =new SelesListDao();
				try{
					///////////////////////////////////
					//DBの接続

					selesDao.connect();

					//ユーザー情報の取得
					dayInfo=selesDao.getBy(searchday);

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

				return dayInfo;
	}
	public List<SelesListBeans> getList(Date searchday) {
		List<SelesListBeans> seleslist=new ArrayList<SelesListBeans>();

		//SelesLisrDaoを呼び出す
		SelesListDao selesDao =new SelesListDao();

		try{
			///////////////////////////////////
			//DBの接続

			selesDao.connect();

			//ユーザー情報の取得
			seleslist=selesDao.getList(searchday);

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
