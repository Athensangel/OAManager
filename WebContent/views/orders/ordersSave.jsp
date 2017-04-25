<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>订单</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css">

</head>
<body>

<!--  内容列表   -->
<form name="form2" action="${pageContext.request.contextPath}/ordersServlet" method="post">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="13">&nbsp;订单新增&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="4%">选择</td>
	<td width="10%">客户姓名</td>
	<td width="10%">客户地址</td>
	<td width="10%">客户电话</td>
	<td width="8%">客户邮箱 </td>
	<td width="6%">订购时间</td>
	<td width="8%">订购的产品</td>
	<td width="10%">订购数目</td>
	<td width="10%">所付金额</td>
	<td width="10%">订单新增时间</td>
	<td width="10%">销售订单</td>
</tr>

<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><input name="custName"/></td>
	<td><input name="custAddress"/></td>
	<td><input name="custPhone"/></td>
	<td><input name="custEmail"/></td>
	<td><input name="oderTime"/></td>
	<td><input name="productId"/></td>
	<td><input name="productCount"/></td>
	<td><input name="money"/></td>
	<td><input name="createTime"/></td>
	<td><input name="userId"/></td>
</tr>

<!-- <tr align="right" bgcolor="#EEF4EA">
	<td height="36" colspan="10" align="center">
	翻页代码</td>
</tr> -->
</table>
<input type="submit" value="新增订单" style="float: right;"/>
</form>


</body>
</html>