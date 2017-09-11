<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../../BaseTop.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>用户列表</title>
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
		<td class="tableHeader"><input type="checkbox" id="all" name="selid" onclick="checkAll('userId');" ></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">用户登录名</td>
		<td class="tableHeader">用户真实姓名</td>
		<td class="tableHeader">用户性别</td>
		<td class="tableHeader">用户手机号</td>
		<td class="tableHeader">用户地址</td>
		<td class="tableHeader">用户权限</td>
		<td class="tableHeader">创建时间</td>
		<td class="tableHeader">创建人</td>
		<td class="tableHeader">更新时间</td>
		<td class="tableHeader">更新人</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${users}" var="u" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		<td><input type="checkbox" class="userId" name="userId" value="${u.userId}"/></td>
		<td>${status.index+1}</td>
		<td>
			${u.username }
		</td>
		<td>
			${u.name }
		</td>
		<td>
			<c:if test="${u.gender eq '男'}">男</c:if>
			<c:if test="${u.gender eq '女'}">女</c:if>
		</td>
		<td>
			${u.telephone }
		</td>
		<td>
			${u.address }
		</td>
		<td>
			<c:if test="${u.role.userRole eq 1 }"><font color="green">用户</font></c:if>
			<c:if test="${u.role.userRole eq 0 }"><font color="red">非用户</font></c:if>
		</td>
		<td><fmt:formatDate value="${u.createTime }" pattern="yyyy-MM-dd"/></td>
		<td>${u.createBy }</td>
		<td><fmt:formatDate value="${u.updateTime }" pattern="yyyy-MM-dd"/></td>
		<td>${u.updateBy }</td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
 
 
</form>
</body>
<%@ include file="../../BaseBottom.jsp" %>
</html>

