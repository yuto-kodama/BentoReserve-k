package lunchReservation.seller.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lunchReservation.seller.beans.SelesListBeans;
import lunchReservation.seller.model.SelesListModel;

/**
 * Servlet implementation class SD2Servlet
 */
@WebServlet("/SD2") //商品別予約検索
public class SelesListCompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//売上一覧

		//jspから年、月、日を入手
		String year=request.getParameter("year_1day"); //年
		String month=request.getParameter("month_1day"); //月
		String day=request.getParameter("day_1day"); //日

		//1つに統合
		String searchday0=year+"-"+month+"-"+day;
		//文字列から日付へ変
		Date searchday=Date.valueOf(searchday0);
		//日付を格納
		SelesListBeans selesList=new SelesListBeans();
		//SelesListBeansへ日付をセット
		selesList.setSearchday(searchday);
		//売上モデルへ
		SelesListModel selesModel=new SelesListModel();
		List<SelesListBeans> list=selesModel.getList(searchday);

		//リクエストにセット
		request.setAttribute("list", list);

		System.out.println(searchday);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/SD2.jsp");
		dispatcher.forward(request, response);
	}

}
