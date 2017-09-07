package cn.ezt.controller;

import javax.swing.border.TitledBorder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	
	@RequestMapping("/title")
	public String title() {
		return "/User/_top";
	}
	@RequestMapping("/main")
	public String main() {
		return "/User/_main";
	}
	
	@RequestMapping("/left")
	public String left() {
		return "/User/_left";
	}
	
	@RequestMapping("/newLicense")
	public String newLicense() {
		return "/User/License/NewLicense";
	}
}
