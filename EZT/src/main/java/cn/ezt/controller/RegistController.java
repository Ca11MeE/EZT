package cn.ezt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.pojo.User;
import cn.ezt.service.RoleService;
import cn.ezt.service.UserService;

@Controller
public class RegistController {

	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;

	// 注册页面
	@RequestMapping("/toregist")
	public String toRegist() {
		return "/regist";
	}

	// 注册操作
	@RequestMapping("/regist")
	public String regist(User user, String password2,String valistr,Model model,HttpSession session) {
		//判断验证码
		String realStr=(String) session.getAttribute("valistr");
		if (!realStr.equalsIgnoreCase(valistr)) {
			model.addAttribute("errMsg","验证码错误"); 
			return "/regist";
		}
		//判断用户名是否存在
		User username=userService.findUserName(user.getUsername());
		if (username!=null) {
			model.addAttribute("errMsg","用户名已存在"); 
			return "/regist";
		}
		//判断两次密码是否一致
		if (!user.getPassword().equals(password2)) {
			model.addAttribute("errMsg","两次密码不一致"); 
			return "/regist";
		}
		//判断电话号码是否真实
		if (!user.getTelephone().matches("1[34578]\\d{9}")) {
			model.addAttribute("errMsg","电话号码格式不正确"); 
			return "/regist";
		}
		
		userService.createUser(user);
		
		return "redirect:/tologin.action";
	}
}
