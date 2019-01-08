package com.yi.projectmanagement.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectmanagement.model.ProjectManagement;
import com.yi.projectmanagement.mvc.CommandHandler;
import com.yi.projectmanagement.service.ProjectManagementService;

public class ProjectManagementListHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			ProjectManagementService service =  new ProjectManagementService();
			List<ProjectManagement> list = service.getList();
			
			req.setAttribute("list", list);
			
			return "/WEB-INF/view/ProjectManagementList.jsp";
		}
		return null;
	}

}
