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
<form name="form2" action="${pageContext.request.contextPath}/userServletUp" method="post">
<input type="hidden" name="toid" value="${user.toid}"/>
<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="13">&nbsp;员工新增&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="4%">选择</td>
	<td width="5%">账号</td>
	<td width="6%">密码</td>
	<td width="5%">真实姓名</td>
	<td width="2%">性别</td>
	<td width="8%">生日</td>
	<td width="6%">电子邮箱</td>
	<td width="8%">住址</td>
	<td width="8%">电话号码</td>
	<td width="6%">QQ号码</td>
	<td width="8%">薪水</td>
	<td width="5%">部门</td>
	<td width="5%">职位</td>
</tr>

<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><input name="username" value="${user.username}"/></td>
	<td><input name="password" value="${user.password}"/></td>
	<td><input name="realname" value="${user.realname}"/></td>
	<td><input name="sex" value="${user.sex}"/></td>
	<td><input name="birthday" value="${user.birthday}"/></td>
	<td><input name="email" value="${user.email}"/></td>
	<td><input name="address" value="${user.address}"/></td>
	<td><input name="telphone" value="${user.telphone}"/></td>
	<td><input name="qq" value="${user.qq}"/></td>
	<td><input name="salary" value="${user.salary}"/></td>
	<td><input name="departid" value="${user.departid}"/></td>
	<td><input name="role" value="${user.role}"/></td>
</tr>

<!-- <tr align="right" bgcolor="#EEF4EA">
	<td height="36" colspan="10" align="center">
	翻页代码</td>
</tr> -->
</table>
<input type="submit" value="修改员工" style="float: right;"/>
</form>


</body>
</html>