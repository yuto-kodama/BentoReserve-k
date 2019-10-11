<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="lunchReservation.seller.beans.ReservationByProductBeans" %>
    <%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品別予約検索結果</title>
</head>
<body>
<%
List<ReservationByProductBeans> list = (List<ReservationByProductBeans>)request.getAttribute("list");
%>
<p>商品別予約一覧      9月9日</p>
<table border="1">
<tr>
 <th>商品コード</th>
 <th>商品名</th>
 <th>予約数</th>
</tr>
<%for(ReservationByProductBeans RBlist : list){%>
 <tr>
  <td><%=RBlist.getProductCode() %><!-- 商品コード --></td>
  <td><%=RBlist.getProductName() %><!-- 商品名 --></td>
  <td><%=RBlist.getProductNumber() %><!-- 予約数 --></td>
  </tr>
  <%} %>
</table>
<footer>
<p><button onclick="history.back()">日付検索</button></p>
</footer>
</body>
</html>