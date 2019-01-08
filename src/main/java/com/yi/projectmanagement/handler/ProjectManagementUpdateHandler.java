package com.yi.projectmanagement.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.projectmanagement.model.ProjectManagement;
import com.yi.projectmanagement.mvc.CommandHandler;
import com.yi.projectmanagement.service.ProjectManagementService;

public class ProjectManagementUpdateHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			return "/WEB-INF/view/ProjectManagementUpdateForm.jsp";
		}else if(req.getMethod().equalsIgnoreCase("post")){
			String no = req.getParameter("no");
			System.out.println(no);
			
			String name = req.getParameter("name");
			System.out.println(name);
			String content = req.getParameter("content");
			System.out.println(content);
			String start_date = req.getParameter("start_date");
			System.out.println(start_date);
			String end_date = req.getParameter("end_date");
			System.out.println(end_date);
			String progress = req.getParameter("progress");
			System.out.println(progress);
			int pno = Integer.parseInt(no);
			ProjectManagement proj = new ProjectManagement();
			proj.setNo(pno);
			proj.setName(name);
			proj.setContent(content);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date sDate = sdf.parse(start_date);
			
			proj.setStart_date(sDate);
			Date eDate = sdf.parse(end_date);
			proj.setEnd_date(eDate);
			proj.setProgress(progress);
			
			
			ProjectManagementService service = ProjectManagementService.getInstance();
			service.update(proj);
			
			return "/WEB-INF/view/ProjectManagementUpdateResult.jsp";
		}
		return null;
	}

}
