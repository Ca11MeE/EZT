package cn.ezt.controller;

import javax.swing.border.TitledBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.service.AgreementService;

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
	
	@RequestMapping("/toLicenseSelect")
	public String toLicenseSelect() {
		return "/User/License/LicenseSelect";
	}
	
	
}
