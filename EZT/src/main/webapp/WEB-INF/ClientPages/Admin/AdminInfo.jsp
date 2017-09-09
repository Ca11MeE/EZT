<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>易账通管理员界面</title>

  </head>
  <frameset rows="10%,*" name="topSet" border="1px black bolder">
	<frame name="top" id="top" scrolling="no" noresize="resize" target="middleSet" src="${app }/Admin/title.action">	
	<frameset cols="20%,*" height="100%" name="middle" id="middle" frameborder="no" border="1px blsack bolder" framespacing="0">
		<frame name="left" id="left" class="leftFrame" target="main" scrolling="no" noresize="resize" src="${app }/Admin/left.action" />
		<frame name="main" id="main" class="rightFrame" noresize="resize" src="${app }/Admin/main.action" />
	</frameset>
</frameset>
  <body>
	  你的浏览器不支持此框架,请更换浏览器
  </body>
</html>
