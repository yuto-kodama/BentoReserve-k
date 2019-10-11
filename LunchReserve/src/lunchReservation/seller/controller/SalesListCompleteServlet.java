package lunchReservation.seller.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SD2Servlet
 */
@WebServlet("/SD2")
public class SalesListCompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//jspから年、月、日を入手
		String year=request.getParameter("year_1day"); //年
		String month=request.getParameter("month__1day"); //月
		String day=request.getParameter("day_1day"); //日
		
		//1つに統合
		String searchday0=year+"-"+month+"-"+day;
		//文字列から日付へ変更
		Date searchday=Date.valueOf(searchday0);
		
		System.out.println(searchday);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/SD2.jsp");
		dispatcher.forward(request, response);
	}

}
