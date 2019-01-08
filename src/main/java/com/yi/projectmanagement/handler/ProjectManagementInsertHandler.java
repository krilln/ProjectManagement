package com.yi.projectmanagement.handler;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.yi.projectmanagement.model.ProjectManagement;
import com.yi.projectmanagement.mvc.CommandHandler;
import com.yi.projectmanagement.service.ProjectManagementService;

public class ProjectManagementInsertHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			return "/WEB-INF/view/ProjectManagementInsertForm.jsp";
		}else if(req.getMethod().equalsIgnoreCase("post")){
			
			String name = req.getParameter("name");
			String content = req.getParameter("content");
			String start_date = req.getParameter("start_date");
			String end_date = req.getParameter("end_date");
			String progress = req.getParameter("progress");
			
			
			ProjectManagement proj = new ProjectManagement();
			proj.setName(name);
			proj.setContent(content);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date sDate = sdf.parse(start_date);
			proj.setStart_date(sDate);
			Date eDate = sdf.parse(end_date);
			proj.setEnd_date(eDate);
			proj.setProgress(progress);
			
			
			ProjectManagementService service = ProjectManagementService.getInstance();
			service.insertProjectManagement(proj);
			
			return "/WEB-INF/view/ProjectManagementInsertSuccess.jsp";
		}
		
		return null;
	}

}
