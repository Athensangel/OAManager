<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>管理</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css">

</head>
<body>

<!--  内容列表   -->
<form name="form2" action="${pageContext.request.contextPath}/productServletAdd" method="post">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="13">&nbsp;产品新增&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="4%">产品名称</td>
	<td width="5%">价格</td>
</tr>

<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td><input name="productName" value="${product.productName}"/></td>
	<td><input name="price" value="${product.price}"/></td>
</tr>

<!-- <tr align="right" bgcolor="#EEF4EA">
	<td height="36" copricelspan="10" align="center">
	翻页代码</td>
</tr> -->
</table>
<input type="submit" value="新增产品" style="float: right;"/>
</form>


</body>
</html>