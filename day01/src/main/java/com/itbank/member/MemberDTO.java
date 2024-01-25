package com.itbank.member;

//IDX      NOT NULL NUMBER        
//USERNAME NOT NULL VARCHAR2(100) 
//USERID   NOT NULL VARCHAR2(100) 
//USERPW   NOT NULL VARCHAR2(500) 
//EMAIL    NOT NULL VARCHAR2(100) 
//GENDER   NOT NULL VARCHAR2(50)

public class MemberDTO {
	
	private int idx;
	private String username;
	private String userid;
	private String userpw;
	private String email;
	private String gender;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
