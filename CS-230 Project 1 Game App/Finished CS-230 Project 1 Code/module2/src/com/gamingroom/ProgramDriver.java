package com.gamingroom;

public class ProgramDriver {
public static void main(String[] args) {

//call for instance of game
GameService service = GameService.getInstance();

//show user game data is testing 
System.out.println("\nAbout to test initializing game data...");

//show status of game 1
Game game1 = service.addGame("Game #1");
	System.out.println(game1);
//show status of game 2
Game game2 = service.addGame("Game #2");
	System.out.println(game2);
//SIngleton tester call
SingletonTester tester = new SingletonTester();
	tester.testSingleton();
		}
}