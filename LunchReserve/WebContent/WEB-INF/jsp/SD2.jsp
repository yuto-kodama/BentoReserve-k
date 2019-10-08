<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>予約商品売上一覧</title>
</head>
<body>
<p>予約商品売上一覧</p> 9月9日から
<br>9月9日まで
<table>
<tr>
<td>全体売上</td>
<td>&yen;31,500</td>
<td>円</td>
</tr>
</table>
<p>商品別売り上げ</p>
<table border="1">
<tr>
<th>商品コード</th>
<th>商品名</th>
<th>売上個数</th>
<th>単価</th>
<th>売上金額</th>
</tr>
<!-- ここにfor文を入れる -->
<tr>
<td>0001</td>
<td>焼肉弁当</td>
<td>30</td>
<td>&yen;350</td>
<td>&yen;10,500</td>
</tr>
</table>
<footer>
<p><button onclick="history.back()">売上日程</button></p>
</footer>
</body>
</html>