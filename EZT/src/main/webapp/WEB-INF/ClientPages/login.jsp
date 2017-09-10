<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="BaseTop.jsp"%>


<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="">
<title>易账通用户登录</title>
<style type="text/css">
$(
function (){ $('form ').marginFlex(0.5); $('div ').fontFlex(20,40,10);
	
}
)
</style>
</head>

<body>
	<div align="center" style="font-size: 40px;">易帐通</div>
	<form id="loginFrm" class="submitFrm" method="POST">
		<table align="center">
			<tr>
				<td colspan="2" align="center"><span> <c:if
							test="${not empty errMsg }">
							<a style="margin-top: 10%; background-color: white; color: red;">${errMsg }</a>
						</c:if>
				</span></td>
			</tr>

			<tr>
				<td>用户名:</td>
				<td><input name="username" type="text" value="${enteredUserName }"/></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td>验证码:</td>
				<td><input name="valistr" type="text" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><img id="valiimg"
					src="${app }/img/valiImg.action" /></td>
			</tr>
			<tr>
				<td colspan="2" style="font-size:10px;text-align:center;">点击图片更换验证码</td>
			</tr>
			<tr>
				<td style="font-size:10px;text-align:center;">
					<input type="checkbox" name="remindUserName"/>记住用户名
				</td>
				<td style="font-size:10px;text-align:center;">
					<input type="checkbox" name="unlogin"/>30天内免登陆
				</td>
			</tr>
			<tr>
				<td id="smbtn" colspan="2"><span id="regist"
					style="margin-right: 20%;"> <input type="button"
						onclick="formSubmit('${app }/toregist.action','_self');"
						value="注册" />
				</span> <span id="login" style="margin-left: 20%;"> <input
						type="button"
						onclick="formSubmit('${app }/login.action','_self');" value="登录" />
				</span></td>
			</tr>


		</table>
	</form>
</body>
<%@ include file="BaseBottom.jsp"%>
</html>
