package cn.ezt.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.pojo.Order;
import cn.ezt.pojo.Role;
import cn.ezt.pojo.User;
import cn.ezt.service.OrderService;
import cn.ezt.service.RoleService;
import cn.ezt.service.UserService;

@Controller
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	RoleService roleService;
	@Autowired
	UserService userService;
	@Autowired
	OrderService orderService;
	
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
	
	//权限管理
	@RequestMapping("/role/manage")
	public String roleManger(Model model) {
		List<Role> roles=roleService.findAll();
		model.addAttribute("roles",roles);
		return "/Admin/Manager/RoleList";
	}
	
	//用户管理
	@RequestMapping("/user/manage")
	public String userManger(Model model) {
		List<User> users=userService.findUserAndRole();
		model.addAttribute("users",users);
		return "/Admin/Manager/UserList";
	}
	
	//用户管理
		@RequestMapping("/order/manage")
		public String orderManger(Model model) {
			List<Order> orders=orderService.findAll();
			model.addAttribute("orders",orders);
			return "/Admin/Manager/OrderList";
		}
	
	

}
