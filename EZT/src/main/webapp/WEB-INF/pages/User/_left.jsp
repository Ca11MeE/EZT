<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../base.jsp" %>


<html>
<head>
<title>易帐通</title>
<style>
body {
	text-align: center;
}

body a {
	text-decoration: none;
	background-color: black;
	color: white;
}
</style>

</head>

<body>
	<span class="leftBtn"> <a href="${app }/NewLicense.jsp">新办营业执照</a>
	</span>
	<br />
	<span class="leftBtn"> <a href="${app }/ToProgressServlet">办理进度查询</a>
	</span>
	<br />
	<!-- <span>
	  	<a href="#">代账</a>
	  </span>
	  <br/>
	  <span>
	  	<a href="#">年报</a>
	  </span>
	  <br/>
	  <span>
	  	<a href="#">变更</a>
	  </span>
	  <br/>
	  <span>
	  	<a href="#">社保</a>
	  </span>
	  <br/>
	  <span>
	  	<a href="#">营业执照查询</a>
	  </span>
	  <br/>
	  <span>
	  	<a href="#">国税</a>
	  </span>
	  <br/>
	  <span>
	  	<a href="#">地税</a>
	  </span>
	  <br/> -->




</body>
<script type="text/javascript">
$(function(){
	$('.leftBtn').fontFlex(10, 40, 10);
})
</script>
</html>
