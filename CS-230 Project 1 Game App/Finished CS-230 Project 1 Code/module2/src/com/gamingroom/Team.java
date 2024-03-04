package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//class extension of Entity 
public class Team extends Entity{
//private list of players on team
private List<Player> players = new ArrayList<Player>();
//public class for team name and ID
public Team(long id, String name) {

super(id, name);
}

public Player addPlayer(String name) {
	Player player = null;
//iterator to start process of adding player to team
Iterator<Player> playersIterator = players.iterator();
	while (playersIterator.hasNext()) {
			Player playerInstance = playersIterator.next();
//if player is already in a game
if (playerInstance.getName().equalsIgnoreCase(name)) {
	player = playerInstance;
		} 
//if player is eligible to join
else {
	players.add(player);
		}
}

return player;
}
//string to show team name
public String toString() {
	return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
		}
}