package cn.ezt.controller.license;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.pojo.Order;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/newLicenseOrder")
	public String createOrder(Order order) {
		System.out.println(order);
		return "/User/_main";
	}
	123123123213
}
