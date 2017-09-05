package com.ezt.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Webloc implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		sce.getServletContext().removeAttribute("app");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String contextPath = sce.getServletContext().getContextPath();
		sce.getServletContext().setAttribute("app", contextPath);
	}
	
}
