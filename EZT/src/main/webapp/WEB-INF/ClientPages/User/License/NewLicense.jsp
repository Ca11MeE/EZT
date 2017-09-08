<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../BaseTop.jsp" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>新办营业执照</title>
    <link href="${app }/css/newLicense.css" rel="stylesheet"/>
  </head>
  
  <body>
   	 <div style="margin-top: 100px">
		<form action="${app }/order/newLicenseOrder.action" method="post">
			<table>
				<tr>
					<td class="tds">申办人或申办公司名称：</td>
					<td><input type="text" name="createrName" /></td>
				</tr>
				<tr>
					<td class="tds">手机号码：</td>
					<td><input type="text" name="telephone" /></td>
				</tr>
				<tr>
					<td class="tds">公司地址：</td>
					<td><input type="text" name="deptAddr" /></td>
				</tr>
				<tr>
					<td class="tds">公司名称：</td>
					<td><input type="text" name="deptName" /></td>
				</tr>
				<tr>
					<td class="sub_td" colspan="2">
						<input type="submit" value="提交资料" />
					</td>
				</tr>
			</table>
		</form>
	</div>
   	 
  </body>
</html>
<%@include file="../../BaseBottom.jsp" %>