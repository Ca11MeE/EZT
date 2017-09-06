<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="base.jsp" %>


<html>
  <head>
  	<meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>易帐通用户登录</title>
  </head>
  
  <body>
	  <form action="${app }/login.action" method="POST">
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
							<a href="${app }/login.action">登录</a>
						</span>
					<td/>
				</tr>
		</table>   
    </form>
  </body>
</html>
