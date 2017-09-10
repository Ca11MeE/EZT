package cn.ezt.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.pojo.User;
import cn.ezt.service.UserService;

@Controller
public class IndexController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/tomain")
	public String toIndex(HttpServletRequest request,Model model) {
		//检查是否有自动登录信息
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if ("autologin".equals(cookie.getName())) {
				//有登录信息
				String[] info = cookie.getValue().split(":");
				String username = info[0];
				String password = info[1];
				User user = userService.findUserByUP(username, password);
				if (user!=null) {
					model.addAttribute("user", user);
					if ("1".equals(user.getRole().getUserRole() == null ? "" : user.getRole().getUserRole())) {
						return "/User/UserInfo";
					}

					return "redirect:/Admin/AdminInfo.action";
				}
				break;
			}
		}
		return "redirect:/tologin.action";
	}
}
