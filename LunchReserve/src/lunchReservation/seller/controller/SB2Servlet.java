package lunchReservation.seller.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductCount
 */
@WebServlet("/SB2")
public class SB2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//すべての選択した値を受け取る
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		String day=request.getParameter("day");
		
		//合わせて「yyyy-MM-dd」形式でStringに格納する
		String searchday=year+"-"+month+"-"+day;
		//Sb2Modelを呼び出す
		Sb2Modal SB2model=new Sb2Model();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/SB2.jsp");
		dispatcher.forward(request, response);
		
	}

}
