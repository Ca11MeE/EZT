<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="BaseTop.jsp"%>


<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="">
<title>易账通用户注册</title>
<style type="text/css">
#telephone {
	color: gray;
}

#address {
	color: gray;
}

#valistr {
	color: gray;
	width: 100%;
}

.chks {
	color: red;
}
</style>
<script type="text/javascript">
	$(

			function() {
				$("form ").marginFlex(0.5);
				/* 电话输入框 */
				$("#telephone").focusout(function() {
					var old = $(this).val();
					if (old == "") {
						$(this).css("color", "gray");
						$(this).val("请输入您的手机号");
					} else {
						if (!(/^1[34578]\d{9}$/.test(old))) {
							$("#telephoneChk").html("手机号格式错误");
						}
					}
				});
				$("#telephone").focusin(function() {
					var old = $(this).val();
					if (old == "请输入您的手机号") {
						$(this).val("");
						$(this).css("color", "black");
					}
				});
				/* 地址输入框 */
				$("#address ").focusout(function() {
					var old = $(this).val();
					if (old == "") {
						$(this).css("color", "gray");
						$(this).val("请输入您的地址");
					}
				});
				$("#address").focusin(function() {
					var old = $(this).val();
					if (old == "请输入您的地址") {
						$(this).val("");
						$(this).css("color", "black");
					}
				});
				/* 验证码输入框 */
				$("#valistr ").focusout(function() {
					var old = $(this).val();
					if (old == "") {
						$(this).css("color", "gray");
						$(this).val("请输入验证码");
					}
				});
				$("#valistr").focusin(function() {
					var old = $(this).val();
					if (old == "请输入验证码") {
						$(this).val("");
						$(this).css("color", "black");
					}
				});
				/*封装非空校验*/
				var chkNull = function(val) {
					if (val == "" || val == null) {
						return true;
					} else {
						return false;
					}
				};
				$("input").focusout(
						function() {
							var id = $(this).attr("id");
							var val = $(this).val();
							if (chkNull(val)) {
								$("#" + id + "Chk").html(
										$(this).parent().prev().text()
												.trim(":")
												+ "不能为空");
							} else {
								$("#" + id + "Chk").html("");
							}
						});
				/*AJAX*/
				$("#username").focusout(function() {
					var username = $(this).val();
					if (!chkNull($(this).val())) {
						$.ajax({
							type : "POST",
							url : "chkUserName.action",
							dataType : "json",
							data : {
								"userName" : username
							},
							success : function(data) {
								if (data != 0) {
									$("#usernameChk").html("用户名已存在");
									$(this).val("");
								} else {
									$("#usernameChk").html("恭喜你,用户名可以使用");
								}
							},
							error : function() {
								$("#usernameChk").html("用户名检查出错!!!");
								$(this).val("");
							}
						});
					}
				});
				/*页面基本逻辑判断*/
				$("#password2").focusout(function() {
					if ($(this).val() != $("#password").val()) {
						$("#password2Chk").html("两次密码不一致");
					}
				});
				$("#regist").click(
						function() {
							var allRight = true;
							var headMsg = "注册失败!!原因:<br/>";
							//非空校验
							$(".info").each(
									function() {
										var id = $(this).attr("id");
										var val = $(this).val();
										if (chkNull(val)) {
											$("#" + id + "Chk").html(
													$(this).parent().prev()
															.text().trim(":")
															+ "不能为空");
											allRight = false;
										}
									});

							if ($("#address").val() == "请输入您的地址") {
								headMsg += "地址不能为空<br/>";
								allRight = false;
							}
							if ($("#telephone").val() == "请输入您的手机号") {
								headMsg += "手机号不能为空<br/>";
								allRight = false;
							} else {
								//电话号码格式校验
								var televal = $("#telephone").val();
								if (!(/^1[34578]\d{9}$/.test(televal))) {
									headMsg += "手机号格式错误<br/>";
									$("#telephoneChk").html("手机号格式错误");
									allRight = false;
								}
							}
							if (allRight) {
								formSubmit('${app }/regist.action', '_self');
							} else {
								$("#headErr").html(headMsg);
							}
						});
				
			})
</script>
</head>

<body>
	<form id="registFrm" class="submitFrm" method="POST"
		style="margin-top: 0px;">
		<div align="center"
			style="font-family: 微软雅黑; color: red; font-size: 20px;"
			id="headErr"></div>
		<table align="center" border="0" style="width: 100%;margin-top:0%">
			<tr>
				<td colspan="3" align="center"><span> <c:if
							test="${not empty errMsg }">
							<a style="margin-top: 10%; background-color: white; color: red;">${errMsg }</a>
						</c:if>
				</span></td>
			</tr>

			<tr>
				<td>用户名:</td>
				<td><input name="username" id="username" type="text"
					class="info" /></td>
				<td><span id="usernameChk" class="chks"></span></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input name="password" id="password" type="password"
					class="info" /></td>
				<td><span id="passwordChk" class="chks"></span></td>
			</tr>
			<tr>
				<td>确认密码:</td>
				<td><input name="password2" id="password2" type="password" /></td>
				<td><span id="password2Chk" class="chks"></span></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input name="name" id="name" type="text" class="info"></td>
				<td><span id="nameChk" class="chks"></span></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><select name="gender">
						<option value="男" selected="selected">男</option>
						<option value="女">女</option>
				</select></td>
			</tr>
			<tr>
				<td>电话号码:</td>
				<td><input type="text" name="telephone" id="telephone"
					value="请输入您的手机号" class="info" /></td>
				<td><span id="telephoneChk" class="chks"></span></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td colspan="2"><textarea name="address" id="address" rows="3"
						cols="20" style="width: 100%;" class="info">请输入您的地址</textarea></td>
				<td><span id="addressChk" class="chks"></span></td>
			</tr>
			<tr>
				<td>验证码:</td>
				<td><input name="valistr" id="valistr" type="text"
					value="请输入验证码" /></td>
				<td align="center" colspan="1"><img id="valiimg"
					src="${app }/img/valiImg.action" /></td>
				<td><span id="valistrChk" class="chks"></span></td>
			</tr>
			<tr>
				<td id="smbtn" colspan="2"><span id="regist"
					style="margin-right: 20%;"> <input type="button" id="regist"
						value="注册" />
				</span> <span id="back" style="margin-left: 20%;"> <input
						type="button" onclick="window.history.go(-1);" value="后退" />
				</span></td>
			</tr>

		</table>
	</form>
</body>
<%@ include file="BaseBottom.jsp"%>
</html>
