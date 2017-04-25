<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>欢迎来到OA管理系统</title>
<base target="_self">
<link rel="stylesheet" type="text/css" href="css/base.css" />
<link rel="stylesheet" type="text/css" href="css/main.css" />
</head>
<body leftmargin="8" topmargin='50'>
  <form action="${pageContext.request.contextPath}/userServletUpInfo" method="post">
    <input type="hidden" name="toid" value="${user.toid}"/>
<table width="40%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'>
		<span>修改账号</span></div>
    	<div style='float:right;padding-right:10px;'></div>
   </td>
  </tr>

  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table  border="0" colspan ="1"  rowspan="1">
        <tr>
          <td width="15%" height="31" align="center">
		    账号
		  </td>
		  <td  height="31" align="center">
		  <input type="text" name="username"  value="${user.username}"/>
		  </td>
        </tr>
		<tr>
          <td width="15%" height="31" align="center">
		    密码
		  </td>
		  <td  height="31" align="center">
		  <input type="password" name="password" value="${user.password}" />
		  </td>
        </tr>
		<tr>
          <td width="15%" height="31" align="center">
		    <input type="submit" value="修改" />
		  </td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>