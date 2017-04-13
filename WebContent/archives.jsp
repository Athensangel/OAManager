<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理</title>
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
    <input type='button' class="coolbg np" onClick="location='';" value='添加员工' />
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
	<td height="24" colspan="10" background="images/tbg.gif">&nbsp;员工列表&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="4%">选择</td>
	<td width="28%">账号</td>
	<td width="10%">真实姓名</td>
	<td width="10%">性别</td>
	<td width="8%">电话号码</td>
	<td width="6%">所属部门</td>
	<td width="8%">角色</td>
	<td width="10%">操作</td>
</tr>

<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan</u></a></td>
	<td>晓岚</td>
	<td>男</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>部门经理</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan</u></a></td>
	<td>晓岚</td>
	<td>男</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>部门经理</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan</u></a></td>
	<td>晓岚</td>
	<td>男</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>部门经理</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan2</u></a></td>
	<td>晓岚2</td>
	<td>女</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>普通员工</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan</u></a></td>
	<td>晓岚</td>
	<td>男</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>部门经理</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>

<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan2</u></a></td>
	<td>晓岚2</td>
	<td>女</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>普通员工</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan2</u></a></td>
	<td>晓岚2</td>
	<td>女</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>普通员工</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td>
	 <input name="id" type="checkbox" id="id" value="101" class="np">
	</td>
	<td><a href=''><u>alan2</u></a></td>
	<td>晓岚2</td>
	<td>女</td>
	<td>4343434</td>
	<td>华东区</td>
	<td>普通员工</td>
	<td>
	 <a href="101">编辑</a> | 
	 <a href="101">预览</a> |
	 <a href="101">删除</a>
	 </td>
</tr>


<tr align="right" bgcolor="#EEF4EA">
	<td height="36" colspan="10" align="center">
	<!--翻页代码 --></td>
</tr>
</table>

</form>


</body>
</html>