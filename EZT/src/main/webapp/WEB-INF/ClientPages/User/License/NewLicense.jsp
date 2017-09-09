<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../BaseTop.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<title>新办营业执照</title>
<link href="${app }/css/newLicense.css" rel="stylesheet" />
</head>

<body>
	<%@include file="../_top.jsp"%>
	<div style="margin-top: 100px">
		<form action="${app }/order/newLicenseOrder.action" method="post">
			<table>
				<tr>
					<td colspan="3" align="center"><span> <c:if
								test="${not empty errMsg }">
								<a style="margin-top: 10%; background-color: white; color: red;">${errMsg }</a>
							</c:if>
					</span></td>
				</tr>
				<tr>
					<td class="tds">办理人名称：</td><!-- 有字数限制 -->
					<td><input type="text" name="createrName"
						value="${newOrder.createrName }" /></td>
				</tr>
				<tr>
					<td class="tds">手机号码：</td>
					<td><input type="text" name="telephone"
						value="${newOrder.telephone }" /></td>
				</tr>
				<tr>
				<!-- 温馨提示:为什么要多写几个公司名称 (首选/次选1/次选2)-->
				</tr>
				<tr>
					<td class="tds">待办公司名称：</td>
					<td><input type="text" name="deptName"
						value="${newOrder.deptName }" /></td>
				</tr>

				<tr>
					<td class="tds">申办的公司地址：</td>
					<td><textarea name="deptAddr" id="deptAddr" rows="3" cols="20"
							style="width: 100%;" class="info">${newOrder.deptAddr }</textarea></td>
				</tr>
				<tr>
					<td class="sub_td"><input type="button"
						onclick="window.history.go(-1)" value="返回" /></td>
					<td class="sub_td"><input type="submit" value="提交资料" /></td>
				</tr>
			</table>
		</form>
	</div>
	<%@include file="../_bottom.jsp"%>
</body>
</html>
<%@include file="../../BaseBottom.jsp"%>