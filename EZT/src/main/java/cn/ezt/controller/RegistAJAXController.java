package cn.ezt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ezt.pojo.User;
import cn.ezt.service.UserService;

@Controller
public class RegistAJAXController {
	
	@Autowired
	UserService userService;
	
	/*
	 * 0表示没有找到
	 * 1表示找到
	 */
	@ResponseBody
	@RequestMapping(value="/chkUserName",method=RequestMethod.POST,produces="application/json;charset=UTF8")
	public Integer chkUserName(String userName) {
		User user=userService.findUserName(userName);
		return user==null?0:1;
	}
}
