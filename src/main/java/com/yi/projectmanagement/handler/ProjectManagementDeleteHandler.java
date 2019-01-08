package com.yi.projectmanagement.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectmanagement.model.ProjectManagement;
import com.yi.projectmanagement.mvc.CommandHandler;
import com.yi.projectmanagement.service.ProjectManagementService;

public class ProjectManagementDeleteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			String no = req.getParameter("no");
			int pno = Integer.parseInt(no);
			
			ProjectManagementService service = new ProjectManagementService();
			boolean delete = service.delete(pno);
			return "list.do";
		}
		return null;
	}

}
