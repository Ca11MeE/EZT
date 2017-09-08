package cn.ezt.controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.omg.CORBA.portable.ValueInputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ezt.tools.ValiImg;

@Controller
@RequestMapping("/img")
public class ImgContoroller {

	@RequestMapping("/valiImg")
	public void getValiImg(HttpServletResponse response,HttpSession session) {
		try {
			OutputStream outputStream = response.getOutputStream();
			String valistr = ValiImg.getValiImg(outputStream);
			session.setAttribute("valistr", valistr);
		} catch (IOException e) {
		}
	}
}
