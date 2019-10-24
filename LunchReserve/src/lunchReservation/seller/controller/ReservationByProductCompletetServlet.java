package lunchReservation.seller.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lunchReservation.seller.beans.ReservationByProductBeans;
import lunchReservation.seller.model.ReservationCheckModel;
/**
 * Servlet implementation class ProductCount
 */
@WebServlet("/SB2") //商品別予約検索機能
public class ReservationByProductCompletetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ReservationCheckModel reservationcheckmodel=new ReservationCheckModel();
		
		List<ReservationByProductBeans> list=reservationcheckmodel.getList();
		
		//リクエストにセット
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/SB2.jsp");
		dispatcher.forward(request, response);
		
	}

}
	