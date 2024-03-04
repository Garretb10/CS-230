package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

//public class for GameService
public class GameService {
//list of games
	private static List<Game> games = new ArrayList<Game>();
//private Game ID
	private static long nextGameId = 1;
//private Player ID
	private static long nextPlayerId = 1;
//private Team ID
	private static long nextTeamId = 1;
//private service for class
	private static GameService service;
	private GameService() {
		}
//check for game
public static GameService getInstance() {
//if no game is created
if (service == null) {
	service = new GameService();
		System.out.println("New Game Service created.");
//if game already exists
} else {
	System.out.println("Game Service already instantiated.");
		}

return service;
}

//adding of game
public Game addGame(String name) {
	Game game = null;
//iterator to create new game 
Iterator<Game> gamesIterator = games.iterator();
	while (gamesIterator.hasNext()) {
		Game gameInstance = gamesIterator.next();
//returning of game instance
if (gameInstance.getName().equalsIgnoreCase(name)) {
	return gameInstance;
		}
}
//new game ID 
if (game == null) {
	game = new Game(nextGameId++, name);
		games.add(game);
			}

return game;
	}
//public class for getting game ID
public Game getGame(long id) {
	Game game = null;
//iterator for game ID
Iterator <Game> gamesIterator = games.iterator();
	while (gamesIterator.hasNext()) {
		Game gameInstance = gamesIterator.next();
//returning of game instance
if (gameInstance.getId() == id) {
	return gameInstance;
		}
}


return game;
}
//public class for getting game name
public Game getGame(String name) {
	 Game game = null;
//iterator for game name 
Iterator<Game> gamesIterator = games.iterator();
	while (gamesIterator.hasNext()) {
		Game gameInstance = gamesIterator.next();
//returning of game instance
if (gameInstance.getName().equalsIgnoreCase(name)) {
	game = gameInstance;
		}
}

return game;
}
//returning of game count
public int getGameCount() {
	return games.size();
		}
//returning of player ID
public long getNextPlayerId() {
	return nextPlayerId;
		}
//returning of team ID
public long getNextTeamId() {
	return nextTeamId;
		}
}