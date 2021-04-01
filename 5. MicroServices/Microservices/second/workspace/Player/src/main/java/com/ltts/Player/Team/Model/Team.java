package com.ltts.Player.Team.Model;

public class Team {
	
	private int teamId;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public Team(int teamId) {
		super();
		this.teamId = teamId;
	}

	/*
	 * public Team() { super(); // TODO Auto-generated constructor stub }
	 */

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + "]";
	}
	
	

}
