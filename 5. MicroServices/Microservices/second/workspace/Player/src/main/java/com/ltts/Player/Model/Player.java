package com.ltts.Player.Model;

public class Player {
	
	private int pid;
	private String pname;
	private int teamid;
	
	
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
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

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int pid, String pname, int teamid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.teamid = teamid;
	}

	
	

}
