package cn.ezt.controller.license;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.service.AgreementService;

@Controller
@RequestMapping("/newLicense")
public class LicenseController {

	@Autowired
	AgreementService agreementService;

	@RequestMapping("/PersonBusiness")
	public String toNewLicense(Model model) {
		// 获取用户协议
		String agreement = agreementService.getAgreement("License");
		model.addAttribute("UserAgreement", agreement);
		return "/User/License/UserAgreement";
	}
}
