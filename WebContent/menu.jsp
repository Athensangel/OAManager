<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/menu.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
</head>
<body target="main">
<table width='99%' height="100%" border='0' cellspacing='0' cellpadding='0'>
  <tr>
    <td style='padding-left:3px;padding-top:8px' valign="top">
	<!-- Item 1 Strat -->
      <dl class='bitem'>
        <dt><b>常用操作</b></dt>
        <dd style='display:block' class='sitem' id='items1_1'>
          <ul class='sitemu'>
            <li>
              <div class='items'>
                <div class='fllct'><a href='${pageContext.request.contextPath}/userServlet' target='main'>员工管理</a></div>
              </div>
            </li>
            <li>
            <div class='items'>
                <div class='fllct'><a href='${pageContext.request.contextPath}/departmentServlet' target='main'>部门管理</a></div>
                </div>
			</li>
            <li>
              <div class='items'>
                <div class='fllct'><a href='${pageContext.request.contextPath}/productServlet' target='main'>产品管理</a></div>
                </div>
            </li>
			<li>
              <div class='items'>
                <div class='fllct'><a href='archives.jsp' target='main'>员工列表</a></div>
                </div>
            </li>
			<li>
              <div class='items'>
                <div class='fllct'><a href='archives.jsp' target='main'>订单列表</a></div>
                </div>
            </li>
			<li>
              <div class='items'>
                <div class='fllct'><a href='archives.jsp' target='main'>
				我的私信<font color='red'>(2)</font></a>
				</div>
				</div>
            </li>
          </ul>
        </dd>
      </dl>
      <!-- Item 1 End -->
      <!-- Item 2 Strat -->
      <dl class='bitem'>
        <dt><b>个人管理</b></dt>
        <dd style='display:block' class='sitem' id='items2_1'>
          <ul class='sitemu'>
            <li>
			 <!-- <a href='' target='_blank'>修改账号</a> -->
			  <div class='items'>
                <div class='fllct'><a href='archives.jsp' target='main'>修改账号</a></div>
                </div>
			</li>
            <li>
			 <div class='items'>
                <div class='fllct'><a href='archives.jsp' target='main'>详细信息设置</a></div>
                </div>
			</li>
          </ul>
        </dd>
      </dl>
      <!-- Item 2 End -->
	  </td>
  </tr>
</table>
</body>
</html>