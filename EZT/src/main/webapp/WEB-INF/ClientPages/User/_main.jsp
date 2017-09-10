<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<%@include file="../BaseTop.jsp"%>

<html>
<head>
<title>易账通</title>
<style type="text/css">
table{
	border:0px;
	width:100%;
	height:100%;
}
tr {
	text-align:center;
	padding:0px;
	margin:0px;
}
td{
	text-align:center;
	padding:0px;
	margin:0px;
}
a{
	text-decoration:none;
}
</style>
<link rel="stylesheet" type="text/css" rev="stylesheet"
	href="${app}/css/top.css">
</head>
<body>
<%@include file="_top.jsp" %>
		<table>
			<tr>
				<td><a href="${app }/userInfo/toLicenseSelect.action" target="main">新办营业执照</a>
				</td>
			</tr>
			<tr>
				<td><a href="${app }/userInfo/toProgress.action" target="main">办理进度查询</a>
				</td>
			</tr>
		</table>
		
		<%@ include file="_bottom.jsp"%>