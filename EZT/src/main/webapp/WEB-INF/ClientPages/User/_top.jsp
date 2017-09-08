<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../BaseTop.jsp"%>


<html>
<head>
<title>易账通</title>

</head>

<body style="background-color: black; text-align: center; color: white;height:auto">

		<div id="pageTitle">
			易账通<input type="button" value="注销"
				onclick="formSubmit('${app }/logout.action','_parent');" />
		</div>
		<form class="submitFrm" method="post"></form>
		<div>
			<span class="leftBtn"> <a href="${app }/userInfo/newLicense"
				target="main">新办营业执照</a>
			</span> <span class="leftBtn"> <a href="${app }/userInfo/toProgress"
				target="main">办理进度查询</a>
			</span>
			<!-- <span>
	  	<a href="#">代账</a>
	  </span>
	  
	  <span>
	  	<a href="#">年报</a>
	  </span>
	  
	  <span>
	  	<a href="#">变更</a>
	  </span>
	  
	  <span>
	  	<a href="#">社保</a>
	  </span>
	  
	  <span>
	  	<a href="#">营业执照查询</a>
	  </span>
	  
	  <span>
	  	<a href="#">国税</a>
	  </span>
	  
	  <span>
	  	<a href="#">地税</a>
	  </span>
	   -->

		</div>
		
		
