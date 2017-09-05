<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML>
<html>
  <head>
    <title>新办营业执照</title>
    <link href="${app }/css/newLicense.css" rel="stylesheet"/>
  </head>
  
  <body>
   	 <div style="margin-top: 100px">
		<form action="" method="post">
			<table>
				<tr>
					<td class="tds">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名&nbsp;：</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td class="tds">手机号码：</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td class="tds">联系地址：</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td class="tds">公司名称：</td>
					<td><input type="text" name="company_name" /></td>
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
