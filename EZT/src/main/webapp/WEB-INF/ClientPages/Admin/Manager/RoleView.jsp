<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="../../BaseTop.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>权限列表</title>
</head>

<body>
	<ul>
		<a href="#" onclick="window.history.go(-1);">返回</a>
	</ul>


	权限列表

	<table>
		<tr>
			<td>权限名称</td>
			<td>${role.roleName }</td>
		</tr>
		<tr>
			<td>超级管理员权限</td>
			<td><c:if test="${role.adminRole eq 1}">
					<font color="green">启用</font>
				</c:if> <c:if test="${role.adminRole eq 0}">
					<font color="green">停用</font>
				</c:if></td>
		</tr>
		<tr>
			<td>管理员权限</td>
			<td><c:if test="${role.rootRole eq 1}">
					<font color="green">启用</font>
				</c:if> <c:if test="${role.rootRole eq 0}">
					<font color="green">停用</font>
				</c:if></td>
		</tr>
		<tr>
			<td>员工权限</td>
			<td><c:if test="${role.agentRole eq 1}">
					<font color="green">启用</font>
				</c:if> <c:if test="${role.agentRole eq 0}">
					<font color="green">停用</font>
				</c:if></td>
		</tr>
		<tr>
			<td>用户权限</td>
			<td><c:if test="${role.userRole eq 1}">
					<font color="green">启用</font>
				</c:if> <c:if test="${role.userRole eq 0}">
					<font color="green">停用</font>
				</c:if></td>
		</tr>
		<tr>
			<td>创建时间</td>
			<td><fmt:formatDate value="${role.createTime }"
					pattern="yyyy-MM-dd" /></td>
		</tr>
		<tr>
			<td>创建人</td>
			<td>${role.createBy }</td>
		</tr>
		<tr>
			<td>更新时间</td>
			<td><fmt:formatDate value="${role.updateTime }"
					pattern="yyyy-MM-dd" /></td>
		</tr>
		<tr>
			<td>更新人</td>
			<td>${role.updateBy }</td>
		</tr>
	</table>


</body>
<%@ include file="../../BaseBottom.jsp"%>
</html>

