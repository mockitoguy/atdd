package org.workshop.app;

import java.util.HashMap;
import java.util.Map;

public class Game {

	private Map<String, Double> stakes = new HashMap<String, Double>();

	public Game(double win, double draw, double lose) {
		stakes.put("win", win);
		stakes.put("draw", draw);
		stakes.put("lose", lose);
	}

	public CompletedGame complete(String result) {
		return new CompletedGame(result, stakes.get(result));
	}
}
