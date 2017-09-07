package cn.ezt.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.pojo.Role;
import cn.ezt.pojo.User;
import cn.ezt.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/tologin")
	public String toLogin(HttpSession session) {
		User user = (User) session.getAttribute("user");
		//日后添加用户权限
		if (user!=null) {
			Role role = user.getRole();
			if ("1".equals(role.getUserRole())) {
				return "/User/UserInfo";
			}
			return "redirect:/Admin/AdminInfo.action";
		}
		return "/login";
	}
	
	@RequestMapping("/login")
	public String login(String username,String password,Model model,HttpSession session) {
		if (StringUtils.isEmpty(username)||StringUtils.isEmpty(password)) {
			model.addAttribute("errMsg","用户名或密码不能为空");
			return "/login";
		}
		User user=userService.findUserByUP(username,password);
		
		if (user==null) {
			model.addAttribute("errMsg","用户名或密码不正确");
			return "/login";
		}
		session.setAttribute("user", user);
		model.addAttribute("user",user);
		//日后添加根据用户权限加载不同页面
		Role userRole=user.getRole();
		if ("1".equals(userRole.getUserRole()==null?"":userRole.getUserRole())) {
			return "/User/UserInfo";
		}
		
		
		return "redirect:/Admin/AdminInfo.action";
	}
	
	//登出操作
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("user", null);
		return "redirect:/tologin";
	}
}
