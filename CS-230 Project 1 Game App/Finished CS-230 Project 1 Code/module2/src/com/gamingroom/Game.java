package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class extending Entity 
public class Game extends Entity {

//private class showing list of teams
private List<Team> teams = new ArrayList<Team>();

//public class for ID and string name
public Game(long id, String name) {

super(id, name);
}

//add to team call
public Team addTeam(String name) {
	Team team = null;

//iterator to ensure no names are identical
Iterator<Team> teamsIterator = teams.iterator();
	while (teamsIterator.hasNext()) {
		Team teamInstance = teamsIterator.next();
//if name is the same
if (teamInstance.getName().equalsIgnoreCase(name)) {
		team = teamInstance;
//if name is unique 
} else {
	teams.add(team);
	}
}

return team;
	}
//show team name and ID
public String toString() {
	return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
		}

}
