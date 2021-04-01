package com.ltts.DetailInfo.model;

public class PlayerTeam 
{
	private int pid;
	
	private String pname;
	
	private String oname;
	
	private String tname;
	
	

	

	public String getTname() {
		return tname;
	}



	public void setTname(String tname) {
		this.tname = tname;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public String getOname() {
		return oname;
	}



	public void setOname(String oname) {
		this.oname = oname;
	}



	public PlayerTeam(int pid, String pname, String oname, String tname) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.oname = oname;
		this.tname = tname;
	}


	
	
	
}
