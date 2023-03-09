package com.mvcproject2;

public class student {

	private int sid;
	private String sname;
	private String scoll;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScoll() {
		return scoll;
	}
	public void setScoll(String scoll) {
		this.scoll = scoll;
	}
	public student(int sid, String sname, String scoll) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scoll = scoll;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", scoll=" + scoll + "]";
	}
	
	
}
