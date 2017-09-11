<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../BaseTop.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<title>新办营业执照</title>
<link href="${app }/css/newLicense.css" rel="stylesheet" />
<style type="text/css">
a {
	text-decoration: none;
}
div{
	width:100%;
}
</style>
</head>

<body>
	<%@include file="../_top.jsp"%>
	<div style="text-align: center; font-size: 40px;">
		新办营业执照</div>
	<hr />
	<table style="width: 100%; height: 100%;border:none;">
		<tr>
			<td width="50%" style="width:50;border-right:1px solid black;">
				<div>
					<a href="${app }/newLicense/PersonBusiness.action">个体工商户</a>
				</div>
				<div>
					<a>小规模纳税人</a>
				</div>
				<div>
					<a>一般纳税人</a>
				</div>
			</td>
			<td width="50%">
				<div>常见问题</div>
				<div>
					<a>1.三者有什么区别</a>
				</div>
				<div>
					<a>2.三者的利与弊</a>
				</div>
				<div>
					<a>3.是不是个体工商户就不用交税和做账</a>
				</div>
			</td>
		</tr>
	</table>
	<%@include file="../_bottom.jsp"%>
</body>
</html>
<%@include file="../../BaseBottom.jsp"%>