package com.yi.projectmanagement.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectmanagement.model.ProjectManagement;
import com.yi.projectmanagement.mvc.CommandHandler;
import com.yi.projectmanagement.service.ProjectManagementService;

public class ProjectManagementReadHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			ProjectManagementService service =  new ProjectManagementService();
			String no = req.getParameter("no");
			int pno = Integer.parseInt(no);
			ProjectManagement proj = service.readProj(pno);
			req.setAttribute("proj", proj);
			return "/WEB-INF/view/ProjectManagementRead.jsp";
		}
		return null;
	}

}
