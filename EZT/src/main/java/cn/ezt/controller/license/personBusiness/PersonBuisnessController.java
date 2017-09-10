package cn.ezt.controller.license.personBusiness;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/License")
public class PersonBuisnessController {
	
	
	@RequestMapping("/PersonBusiness")
	public String newLicense(String agree,Model model) {
		//验证是否勾选同意
		if("on".equals(agree)) {
			//勾选了同意
			return "/User/License/PersonBusiness";
			
		}else {
			//没有勾选同意则提示并跳回本页面
			model.addAttribute("errMsg","请勾选\"我愿意遵守以上条款\"");
			return "/User/License/UserAgreement";
		}
	}
}
