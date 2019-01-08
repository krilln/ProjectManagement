package com.yi.projectmanagement.service;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;


import com.yi.projectmanagement.dao.ProjectManagementDao;
import com.yi.projectmanagement.model.ProjectManagement;
import com.yi.projectmanagement.mvc.MySqlSessionFactory;

public class ProjectManagementService {
	private static final String namespace = "com.yi.projectmanagement.dao.ProjectManagementDao";
	
	private static ProjectManagementService service = new ProjectManagementService();
	
	public static ProjectManagementService getInstance(){
		return service;
	}
	
	public void insertProjectManagement(ProjectManagement proj){
		SqlSession session = null;
		
		try {
			session = MySqlSessionFactory.openSession();
			
			ProjectManagementDao dao = session.getMapper(ProjectManagementDao.class);
			ProjectManagement project = new ProjectManagement();
			project.setNo(0);
			project.setName(proj.getName());
			project.setContent(proj.getContent());
			project.setStart_date(proj.getStart_date());
			project.setEnd_date(proj.getEnd_date());
			project.setProgress(proj.getProgress());
			
			dao.insert(project);
			dao.selectLastNo();
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	
	public List<ProjectManagement> getList(){
		SqlSession session = null;
		
		try {
			session = MySqlSessionFactory.openSession();
			ProjectManagementDao dao = session.getMapper(ProjectManagementDao.class);
			
			return dao.selectByAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	public ProjectManagement readProj(int no){
		SqlSession session = null;
		
		try {
			session = MySqlSessionFactory.openSession();
			ProjectManagementDao dao = session.getMapper(ProjectManagementDao.class);
			
			ProjectManagement proj = dao.selectByNo(no);
			ProjectManagement project = new ProjectManagement();
			project.setNo(proj.getNo());
			project.setName(proj.getName());
			project.setContent(proj.getContent());
			project.setStart_date(proj.getStart_date());
			project.setEnd_date(proj.getEnd_date());
			project.setProgress(proj.getProgress());
			return project;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
		
	}
	public boolean delete(int no){
		SqlSession session = null;
		
		try {
			session = MySqlSessionFactory.openSession();
			
			ProjectManagementDao dao = session.getMapper(ProjectManagementDao.class);
			dao.delete(no);
			session.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return false;
	}
	
	public void update(ProjectManagement proj){
		try (SqlSession session = MySqlSessionFactory.openSession();){
			session.update(namespace+".update", proj);
			
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
