package com.my.board.dto;

import java.util.Date;

public class BoardDto {

	private int myno;
	private String myname;
	private String mytitle;
	private String mycontext;
	private Date sysdate;
	
	public BoardDto() {
	}
	public BoardDto(int myno, String myname, String mytitle, String mycontext, Date sysdate) {
		this.myno = myno;
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontext = mycontext;
		this.sysdate = sysdate;
	}
	
	public int getMyno() {
		return myno;
	}
	public void setMyno(int myno) {
		this.myno = myno;
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public String getMytitle() {
		return mytitle;
	}
	public void setMytitle(String mytitle) {
		this.mytitle = mytitle;
	}
	public String getMycontext() {
		return mycontext;
	}
	public void setMycontext(String mycontext) {
		this.mycontext = mycontext;
	}
	public Date getSysdate() {
		return sysdate;
	}
	public void setSysdate(Date sysdate) {
		this.sysdate = sysdate;
	}
	
	
	
}
