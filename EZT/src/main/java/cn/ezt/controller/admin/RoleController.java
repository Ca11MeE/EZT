package cn.ezt.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.ezt.pojo.Role;
import cn.ezt.service.RoleService;

@Controller
@RequestMapping("/Admin/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;

	@RequestMapping("/toview")
	public String toView(String roleId,Model model) {
		if (StringUtils.isEmpty(roleId)) {
			return "redirect:/Admin/role/toview";
		}
		Role role=roleService.findRoleById(roleId);
		model.addAttribute("role",role);
		return "/Admin/Manager/RoleView";
	}
}
