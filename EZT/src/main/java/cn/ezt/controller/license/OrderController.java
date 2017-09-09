package cn.ezt.controller.license;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.pojo.Order;
import cn.ezt.pojo.User;
import cn.ezt.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	//创建订单
	@RequestMapping("/newLicenseOrder")
	public String createOrder(Order order,Model model,HttpSession session) {
		User user=(User) session.getAttribute("user");
		if (user==null) {
			return "redirect:/tologin";
		}
		model.addAttribute("newOrder",order);
		//数据校验
		String reg="1[34578]\\d{9}";
		if (!order.getTelephone().matches(reg)) {
			model.addAttribute("errMsg","电话号码格式不正确"); 
			return "/User/License/NewLicense";
		}
		orderService.createOrder(order,user);
		return "/User/_main";
	}
	
}
