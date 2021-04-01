package com.ltts.Team.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Team.Dao.TeamDao;
import com.ltts.Team.Model.Team;

@RestController
public class TeamController {

	@Autowired
	TeamDao td;
	
	@RequestMapping("/teams")
	public List<Team> getAllTeams()
	{
		return td.getAllTeams();
	}
	
}
