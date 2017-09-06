<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>易帐通用户界面</title>

  </head>
  <frameset rows="20%,*" name="topSet" border="1px black bolder">
	<frame name="top" scrolling="no"  target="middleSet" src="title.action">	
	<frameset cols="20%,*" height="100%" name="middle" frameborder="no" border="1px blsack bolder" framespacing="0">
		<frame name="left" class="leftFrame" target="main" scrolling="no" src="left.action" />
		<frame name="main" class="rightFrame" src="main.action" />
	</frameset>
</frameset>
  <body>
	  你的浏览器不支持此框架,请更换浏览器
  </body>
</html>
