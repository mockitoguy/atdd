package org.workshop.specs;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.workshop.app.CompletedGame;
import org.workshop.app.Game;

@RunWith(ConcordionRunner.class)
public class GamblerBettingTest {
	
	Game game;
	CompletedGame completedGame;
    
    public void configureStakes(double win, double draw, double lose) {
    	game = new Game(win, draw, lose);
    }
    
    public void setResult(String result) {
    	completedGame = game.complete(result);
    }
    
    public double calculateWin(double stake, String bet) {
        game = null;
    	return completedGame.calculateWin(bet, stake);
    }
}