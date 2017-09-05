<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta charset="utf-8"/>
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>易帐通</title>
    <link href="${app }/css/bootstrap-theme.css" rel="stylesheet">

	<script src="${app }/js/jquery-1.4.2.js" type="text/javascript" />
	
	
	<script src="${app }/js/bootstrap.js" >
	
	</script>
  </head>
  
  <body>
	  <form action="${app }/LoginServlet" method="POST">
		<table align="center">
			
				<tr>
					<td>用户名:	
						<input id="username" type="text"/>
					</td>
				</tr> 
				<tr>
					<td>密码: 
						<input id="password" type="password"/>
					</td>
				</tr>
				<tr>
					<td>验证码: 
						<input id="valistr" type="text"/>
						<img id="valiimg" src="${app }/img/regist/yzm.jpg"/>
					</td>
				</tr>
				<tr>
					<td id="smbtn">
						<span id="regist">
							<a href="${app }/Regist.jsp">注册</a>
						</span>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<span id="login">
							<a href="${app }/LoginServlet">登录</a>
						</span>
					<td/>
				</tr>
		</table>   
    </form>
    <div>${app }</div>
  </body>
</html>
