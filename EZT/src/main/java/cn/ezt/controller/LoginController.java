package cn.ezt.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
		if (user != null) {
			Role role = user.getRole();
			if ("1".equals(role.getUserRole())) {
				return "/User/UserInfo";
			}
			return "redirect:/Admin/AdminInfo.action";
		}
		return "/login";
	}

	@RequestMapping("/login")
	public String login(String username, String password, String valistr, String remindUserName, String unlogin,
			Model model, HttpSession session,HttpServletResponse response) {
		// 如果已登录则直接跳转到首页
//		User logined = (User) session.getAttribute("user");
//		if (logined != null) {
//			User logineduser = userService.findUserByUP(logined.getUsername(), logined.getPassword());
//			if (logineduser != null) {
//				if ("1".equals(
//						logineduser.getRole().getUserRole() == null ? "" : logineduser.getRole().getUserRole())) {
//					return "/User/UserInfo";
//				}
//
//				return "redirect:/Admin/AdminInfo.action";
//			}
//
//		}
		// 检查验证码
		String realStr = (String) session.getAttribute("valistr");
		if (realStr == null || !realStr.equalsIgnoreCase(valistr)) {
			model.addAttribute("errMsg", "验证码不正确");
			return "/login";
		}
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			model.addAttribute("errMsg", "用户名或密码不能为空");
			return "/login";
		}

//		// 检查是否勾选记住用户名
//		if (remindUserName != null && "on".equals(remindUserName)) {
//			// 勾选
//			model.addAttribute("enteredUserName",username);
//		}else {
//			model.addAttribute("enteredUserName",null);
//		}
//		// 检查是否勾选30天免登陆
//		if (unlogin != null && "on".equals(unlogin)) {
//			// 勾选
//			Cookie au=new Cookie("autologin", username+":"+password);
//			au.setMaxAge(30*24*3600);
//			au.setPath("/");
//			response.addCookie(au);
//		}else {
//			Cookie au=new Cookie("autologin", null);
//			au.setMaxAge(-1);
//			au.setPath("/");
//			response.addCookie(au);
//		}
//		session.setAttribute("user", user);
//		model.addAttribute("user", user);
		//利用shiro登陆
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(username, password);
		try {
//			subject.login(token);
			//登陆成功
//			session.setAttribute("user", (User)subject.getPrincipal());
			User user = userService.findUserByUP(remindUserName, password);
			if (user!=null) {
				
			Role userRole = ( (User)subject.getPrincipal()).getRole();
			if ("1".equals(userRole.getUserRole() == null ? "" : userRole.getUserRole())) {
				return "/User/UserInfo";
			}
			return "redirect:/Admin/AdminInfo.action";
			}else {
				model.addAttribute("errMsg", "用户名或密码不正确");
				return "/login";
			}
		} catch (AuthenticationException e) {
			//登录失败
			e.printStackTrace();
			model.addAttribute("errMsg", "用户名或密码不正确");
			return "/login";
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("errMsg", "发生错误,请联系网站管理员解决");
			return "/login";
		}
		// 日后添加根据用户权限加载不同页面
		

		
	}

	// 登出操作
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("user", null);
		return "redirect:/tologin";
	}

}
