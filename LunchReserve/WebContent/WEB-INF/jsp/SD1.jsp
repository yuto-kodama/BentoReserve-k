<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>予約売上検索</title>
</head>
<body>
<p>1日の売上一覧</p>
<form action="SD2" method="post">
<p>売上日
<select name="year_1day">
<%for(int y=2019; y<2021; y++){%>
<option value=<%=y %>><%=y %></option>
<%}%>
</select><label for="year">年</label>
<select name="month_1day">
<%for(int m=1; m<13; m++){%>
<option value=<%=m %>><%=m %></option>
<%}%>
</select><label for="month">月</label>
<select name="day_1day">
<%for(int d=1; d<32; d++){%>
<option value=<%=d %>><%=d %></option>
<%}%>
</select><label for="day">日</label>
</p>
<p><input type="submit"value="検索"></p>
</form>
</body>
</html>