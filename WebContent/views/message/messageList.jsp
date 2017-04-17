<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息</title>
<link rel="stylesheet" type="text/css" href="css/base.css">

</head>
<body leftmargin="8" topmargin="8" background='images/allbg.gif'>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
<tr>
 <td height="26" background="images/newlinebg3.gif">
  <table width="98%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  <td align="right">
    <!-- <input type='button' class="coolbg np" onClick="" value='添加员工' /> -->
    <a href="${pageContext.request.contextPath}/messageServletSave">添加信息</a>
 </td>
 </tr>
</table>
</td>
</tr>
</table>
 
 <!--  搜索表单  -->
<form name='form3' action='' method='get'>
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='images/wbg.gif' align='center'>
      <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
          <td width='90' align='center'>搜索条件：</td>
          <td width='160'>
          <select name='cid' style='width:150'>
          <option value='0'>选择部门...</option>
          	<option value='1'>部门1</option>
			<option value='2'>部门2</option>
          </select>
        </td>
        <td width='70'>
          员工姓名：
        </td>
        <td width='160'>
          	<input type='text' name='keyword' value='' style='width:150px' />
        </td>
        
        <td>
          <input name="imageField" type="image" src="images/frame/search.gif" width="45" height="20" border="0" class="np" />
        </td>
       </tr>
      </table>
    </td>
  </tr>
</table>
</form>
  
<!--  内容列表   -->
<form name="form2">
<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="10" background="images/tbg.gif">&nbsp;信息列表&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="4%">选择</td>
	<td width="28%">发信人</td>
	<td width="10%">收信人</td>
	<td width="10%">信息内容</td>
	<td width="10%">是否已读</td>
	<td width="10%">操作</td>
</tr>

<c:forEach items="${messageList}" var="message">
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>${message.fromId}</u></a></td>
	<td>${message.toId}</td>
	<td>${message.content}</td>
	<td>${message.isRead}</td>
	<td>
	 <a href="${pageContext.request.contextPath}/MessageServletUp?id=${message.id}">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="${pageContext.request.contextPath}/messageServletDel?id=${message.id}">删除</a>
	 </td>
</tr>
</c:forEach>
<tr align="right" bgcolor="#EEF4EA">
	<td height="36" colspan="6" align="center">
	<!--翻页代码 --></td>
</tr>
</table>

</form>


</body>
</html>