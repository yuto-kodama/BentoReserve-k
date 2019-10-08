<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品別予約検索</title>
</head>
<body>
商品別予約検索 日付       
<form action="SB2" method="post">
<select name="year">
<%for(int y=2019; y<2021; y++){%>
<option value=<%=y %>><%=y %></option>
<%}%>
</select><label for="month">月</label>
<select name="month">
<%for(int m=1; m<13; m++){%>
<option value=<%=m %>><%=m %></option>
<%}%>
</select><label for="month">月</label>
<select name="day">
<%for(int d=1; d<32; d++){%>
<option value=<%=d %>><%=d %></option>
<%}%>
</select><label for="day">日</label>
<input type="submit"value="検索"> 
</form>
</body>
</html>