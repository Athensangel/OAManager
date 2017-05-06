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
  <form action="${pageContext.request.contextPath}/loginServlet" method="post">
<table width="40%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'>
		<span>OA系统登陆</span></div>
    	<div style='float:right;padding-right:10px;'></div>
   </td>
  </tr>

  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table  border="0" cellspacing="1" cellpadding="1">
        <tr>
          <td width="15%" height="31" align="center">
		    账号
		  </td>
		  <td  height="31" align="center">
		  <input type="text" name="username" />
		  </td>
        </tr>
		<tr>
          <td width="15%" height="31" align="center">
		    密码
		  </td>
		  <td  height="31" align="center">
		  <input type="password" name="password" />
		  </td>
        </tr>
        <tr>
          <td width="15%" height="31" align="center">
		   验证码：
		  </td>
		  <td  height="31" align="center">
		  <input type="text" name="validateCode" /><img src="${pageContext.request.contextPath}/validateCodeServlet" style="width: 133px;height: 20px;">
		  </td>
        </tr>
		<tr>
          <td width="15%" height="31" align="center">
		    <input type="submit" value="登录" />
		  </td>
		  <td  height="31" align="center">
		  <input type="submit" value="取消" />
		  </td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>