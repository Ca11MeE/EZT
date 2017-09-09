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
	
	@Autowired
	AgreementService agreementService;
	
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
	
	@RequestMapping("/toNewLicense")
	public String toNewLicense(Model model) {
		//获取用户协议
		String agreement = agreementService.getAgreement("License");
		model.addAttribute("UserAgreement",agreement);
		return "/User/License/UserAgreement";
	}
	
	@RequestMapping("/newLicense")
	public String newLicense(String agree) {
		//验证是否勾选同意
		System.out.println(agree);
		//勾选了同意
		return "/User/License/NewLicense";
		//没有勾选同意则提示并跳回本页面
	}
}
