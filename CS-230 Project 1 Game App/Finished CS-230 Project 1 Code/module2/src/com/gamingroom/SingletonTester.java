package com.gamingroom;

public class SingletonTester {
public void testSingleton() {
//notify player of Singleton testing
System.out.println("\nAbout to test the singleton...");
//call for instance of game
GameService service = GameService.getInstance();
//loop for retrieving game count
for (int i = 1; i <= service.getGameCount(); i++) {
	System.out.println(service.getGame(i));
		}

	}

}