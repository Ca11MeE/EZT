<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<%@include file="../BaseTop.jsp"%>

<html>
<head>
<title>易账通</title>

<link rel="stylesheet" type="text/css" rev="stylesheet"
	href="${app}/css/top.css">
</head>
<body>
<div id="common_head">
	<div id="line1">
		<div id="content">
			<%-- <!-- 如果用户没有登陆, 应该提示登陆或注册 -->
			<c:if test="${ sessionScope.user == null }">
				<a href="${ app }/login.jsp">登录</a>&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="${ app }/regist.jsp">注册</a>
			</c:if> --%>
			<!-- 如果用户已经登陆, 应该提示欢迎xxx回来 -->
			<c:if test="${user!=null }">
				欢迎 ${ user.name } 回来
				&nbsp;|&nbsp;
				<a href="${ app }/logout.action">退出</a>
			</c:if>
			
			
			<%-- <!-- 如果用户没有登陆, 应该提示登陆或注册 -->
			<% if(request.getSession().getAttribute("user") == null){ %>
			
				<a href="${ app }/login.jsp">登录</a>&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="${ app }/regist.jsp">注册</a>
			
			<% }else{ %>
			<!-- 如果用户已经登陆, 应该提示欢迎xxx回来 -->
				欢迎 <%= ((User)request.getSession().getAttribute("user")).getUsername() %> 回来
				&nbsp;|&nbsp;
				
				<a href="${ app }/logout.action">退出</a>
			<% } %> --%>
			
			
		</div>
	</div>
	 <div id="line2">
	 	<a style="font-size:30px;">易帐通</a>
		<%--<img id="logo" src="${ app }/img/head/logo.jpg"/>
		<input type="text" name=""/>
		<input type="button" value="搜 索"/>
		<span id="goto">
			<a id="goto_order" href="${app }/OrderListServlet">我的订单</a>
			<a id="goto_cart" href="${app }/BackProdCartServlet">我的购物车</a>
		</span>
		<img id="erwm" src="${ app }/img/head/qr.jpg"/>--%>
	</div> 
	<div id="line3">
		<div id="content">
			<ul>
				<li><a href="${app }/login.action">首页</a></li>
				<li> <a href="${app }/userInfo/newLicense"
				target="main">新办营业执照</a></li>
				<li><a href="${app }/userInfo/toProgress"
				target="main">办理进度查询</a></li>
				<%-- <li><a href="${app }/servlet/BackProdPageServlet?cate=1">床上用品</a></li>
				<li><a href="${app }/servlet/BackProdPageServlet?cate=2">家用电器</a></li>
				<li><a href="${app }/servlet/BackProdPageServlet?cate=3">日用百货</a></li>
				<li><a href="${app }/servlet/BackProdPageServlet?cate=4">服装服饰</a></li>
				<li><a href="${app }/servlet/BackProdPageServlet?cate=5">图书杂志</a></li>
				<li><a href="${app }/servlet/BackProdPageServlet?cate=6">服装服饰</a></li>
				<li><a href="${app }/servlet/BackProdPageServlet?cate=7">理财产品</a></li> --%>
			</ul>
		</div>
	</div>
<!-- </div> -->