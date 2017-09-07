<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../BaseTop.jsp"%>


<html>
<head>
<title>易账通</title>

</head>

<body style="background-color:black;font-size:40px;text-align:center;color:white;">
	<div>易账通后台管理页面<input type="button" value="注销" onclick="formSubmit('${app }/logout.action','_parent');"/>
	</div>
	<form class="submitFrm" method="post"></form>
</body>
<%@include file="../BaseBottom.jsp" %>
</html>
