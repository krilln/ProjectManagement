package com.yi.projectmanagement.model;

import java.util.Date;

public class ProjectManagement {
	private int no;
	private String name;
	private String content;
	private Date start_date;
	private Date end_date;
	private String progress;
	
	
	
	public ProjectManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ProjectManagement(int no, String name, String content, Date start_date, Date end_date, String progress) {
		super();
		this.no = no;
		this.name = name;
		this.content = content;
		this.start_date = start_date;
		this.end_date = end_date;
		this.progress = progress;
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getStart_date() {
		return start_date;
	}
	
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}


	@Override
	public String toString() {
		return "ProjectManagement [no=" + no + ", name=" + name + ", content=" + content + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", progress=" + progress + "]";
	}
	
	
	
	
}
