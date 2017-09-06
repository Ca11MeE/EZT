package cn.ezt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserInfoController {
	
	@RequestMapping("/left")
	public String left() {
		return "/User/_left";
	}
}
