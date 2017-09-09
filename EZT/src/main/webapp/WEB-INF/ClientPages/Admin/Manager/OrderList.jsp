<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../../BaseTop.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>订单列表</title>
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
		<td class="tableHeader"><input type="checkbox" id="all" name="selid"  ></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">申办人或申办公司名称</td>
		<td class="tableHeader">公司名称</td>
		<td class="tableHeader">公司地址</td>
		<td class="tableHeader">联系电话</td>
		<td class="tableHeader">业务员</td>
		<td class="tableHeader">创建时间</td>
		<td class="tableHeader">创建人</td>
		<td class="tableHeader">更新时间</td>
		<td class="tableHeader">更新人</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${orders}" var="o" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		<td><input type="checkbox" class="orderId" name="orderId" value="${o.orderId}"/></td>
		<td>${status.index+1}</td>
		<td>
			${o.createrName }
		</td>
		<td>
			${o.deptName }
		</td>
		<td>
			${o.deptAddr }
		</td>
		<td>
			${o.telephone }
		</td>
		<td>
			${o.agentId }
		</td>
		<td><fmt:formatDate value="${o.createTime }" pattern="yyyy-MM-dd"/></td>
		<td>${o.createBy }</td>
		<td><fmt:formatDate value="${o.updateTime }" pattern="yyyy-MM-dd"/></td>
		<td>${o.updateBy }</td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
 
 
</form>
</body>
<%@ include file="../../BaseBottom.jsp" %>
</html>

