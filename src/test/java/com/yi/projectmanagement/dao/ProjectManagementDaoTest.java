package com.yi.projectmanagement.dao;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.yi.projectmanagement.model.ProjectManagement;
import com.yi.projectmanagement.mvc.MySqlSessionFactory;
import com.yi.projectmanagement.service.ProjectManagementService;

public class ProjectManagementDaoTest {
	private ProjectManagementService service = ProjectManagementService.getInstance();

	@Test
	public void testInsert() {
		SqlSession session = null;

		try {
			session = MySqlSessionFactory.openSession();
			ProjectManagementDao dao = session.getMapper(ProjectManagementDao.class);

			ProjectManagement proj = new ProjectManagement();
			proj.setNo(0);
			proj.setName("404");
			proj.setContent("page not found");
			Date sdate = new Date();
			proj.setStart_date(sdate);
			Date edate = new Date();
			proj.setEnd_date(edate);
			proj.setProgress("준비");
			dao.insert(proj);
			dao.selectLastNo();
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Test
	public void testupdate(){
		ProjectManagement newUpdate = new ProjectManagement();
		newUpdate.setNo(15);
		newUpdate.setName("호구2");
		newUpdate.setContent("ddddddd");
		Date sd = new Date(2019,0,03);
		newUpdate.setStart_date(sd);
		Date ed = new Date(2019,0,06);
		newUpdate.setEnd_date(ed);
		newUpdate.setProgress("진행중");
		service.update(newUpdate);
		
	}

}
