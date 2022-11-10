package com.springmvc.beans;

public class EmployeeRegister 
{
	private String name;
	private int phno;
	private String eid;
	private int age;
	private String username;
	private String pwd;
	
	
	public EmployeeRegister(String name, int phno, String eid, int age, String username, String pwd) {
		super();
		this.name = name;
		this.phno = phno;
		this.eid = eid;
		this.age = age;
		this.username = username;
		this.pwd = pwd;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
