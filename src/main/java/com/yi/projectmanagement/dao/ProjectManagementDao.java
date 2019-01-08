package com.yi.projectmanagement.dao;

import java.sql.SQLException;
import java.util.List;

import com.yi.projectmanagement.model.ProjectManagement;



public interface ProjectManagementDao {
	public int insert(ProjectManagement proj) throws SQLException;
	public int selectLastNo() throws SQLException;
	public List<ProjectManagement> selectByAll() throws SQLException;
	public ProjectManagement selectByNo(int no) throws SQLException;
	public int delete(int no) throws SQLException;
	public int update(ProjectManagement proj) throws SQLException;
}
