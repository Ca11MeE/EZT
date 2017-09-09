<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="../../BaseTop.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户协议</title>
<script type="text/javascript">
	$(function() {
		$("#agree").click(function() {
			if ($(this).attr("checked") == "checked") {
				$("#next").attr("disabled", false);
			} else {
				$("#next").attr("disabled", true);
			}
		});
		$("#next").click(function() {
			formSubmit("${app}/userInfo/newLicense", "_self");
		});
	})
</script>
</head>
<body>
	<%@include file="../_top.jsp"%>
	<div align="center">
		<span> <c:if test="${not empty errMsg }">
				<a style="margin-top: 10%; background-color: white; color: red;">${errMsg }</a>
			</c:if>
		</span>
	</div>
	<textarea rows="50" cols="50" style="width: 100%; height: 80%;" readonly="readonly">${UserAgreement}</textarea>
	<input type="checkbox" id="agree" name="agree" value="我已同意该协议" />
	<div align="center">
		<input type="button" id="next" disabled="disabled" value="下一步" />
	</div>
	<%@include file="../_bottom.jsp"%>
</body>
<%@include file="../../BaseBottom.jsp"%>
</html>