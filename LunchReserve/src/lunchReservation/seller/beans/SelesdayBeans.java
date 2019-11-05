package lunchReservation.seller.beans;

import java.sql.Date;

public class SelesdayBeans {
	private Date searchday;
	private int totalprice;
	public Date getSearchday() {
		return searchday;
	}
	public void setSearchday(Date searchday) {
		this.searchday = searchday;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
}
