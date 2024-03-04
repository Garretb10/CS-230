package com.gamingroom;

public class Player extends Entity{
//public class for player name
public Player(long id, String name) {
	super(id, name);
		}
 //show player name
public String toString() {
	return "Player [id=" + super.getId() + ", name=" + super.getName() + "]";
		}
}