<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../../BaseTop.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>权限列表</title>
	<script type="text/javascript">
	
	</script>
</head>

<body>
<form name="icform" method="post" class="submitFrm">

<ul>
	<a href="#" onclick="formSubmit('toview','_self');this.blur();">查看</a>
	<a href="#" onclick="formSubmit('tocreate','_self');this.blur();">新增</a>
	<a href="#" onclick="formSubmit('toupdate','_self');this.blur();">修改</a>
	<a href="#" onclick="formSubmit('delete','_self');this.blur();">删除</a>
	<a href="#" onclick="formSubmit('roleModule','_self');this.blur();">模块</a>
</ul>
   
	
    权限列表

<table id="ec_table" class="tableRegion" width="98%" style="font-size:16px;">
	<thead>
	<tr>
		<td class="tableHeader"><input type="checkbox" id="all" name="selid" onclick="checkAll(roleId);" ></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">权限名称</td>
		<td class="tableHeader">超级管理员权限</td>
		<td class="tableHeader">管理员权限</td>
		<td class="tableHeader">员工权限</td>
		<td class="tableHeader">用户权限</td>
		<td class="tableHeader">创建时间</td>
		<td class="tableHeader">创建人</td>
		<td class="tableHeader">更新时间</td>
		<td class="tableHeader">更新人</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${roles}" var="r" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		<td><input type="checkbox" class="roleId" name="roleId" value="${r.roleId}"/></td>
		<td>${status.index+1}</td>
		<td>
			${r.roleName }
		</td>
		<td>
			<c:if test="${r.adminRole eq 1}"><font color="green">启用</font></c:if>
			<c:if test="${r.adminRole eq 0}"><font color="green">停用</font></c:if>
		</td>
		<td>
			<c:if test="${r.rootRole eq 1}"><font color="green">启用</font></c:if>
			<c:if test="${r.rootRole eq 0}"><font color="green">停用</font></c:if>
		</td>
		<td>
			<c:if test="${r.agentRole eq 1}"><font color="green">启用</font></c:if>
			<c:if test="${r.agentRole eq 0}"><font color="green">停用</font></c:if>
		</td>
		<td>
			<c:if test="${r.userRole eq 1}"><font color="green">启用</font></c:if>
			<c:if test="${r.userRole eq 0}"><font color="green">停用</font></c:if>
		</td>
		<td><fmt:formatDate value="${r.createTime }" pattern="yyyy-MM-dd"/></td>
		<td>${r.createBy }</td>
		<td><fmt:formatDate value="${r.updateTime }" pattern="yyyy-MM-dd"/></td>
		<td>${r.updateBy }</td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
 
 
</form>
</body>
<%@ include file="../../BaseBottom.jsp" %>
</html>

