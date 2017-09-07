package cn.ezt.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.pojo.Role;
import cn.ezt.pojo.User;
import cn.ezt.service.RoleService;

@Controller
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping("/AdminInfo")
	public String adminInfo(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user==null) {
			return "redirect:/tologin.action";
		}
		if ("1".equals(user.getRole().getUserRole())) {
			return "/User/UserInfo";
		}
		return "/Admin/AdminInfo";
	}
	
	@RequestMapping("/title")
	public String title() {
		return "/Admin/_top";
	}
	@RequestMapping("/main")
	public String main() {
		return "/Admin/_main";
	}
	
	@RequestMapping("/left")
	public String left() {
		return "/Admin/_left";
	}
	
	@RequestMapping("/role/manage")
	public String roleManger(Model model) {
		List<Role> roles=roleService.findAll();
		model.addAttribute("roles",roles);
		return "/Admin/Manager/RoleList";
	}

}
