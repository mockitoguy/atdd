package org.workshop.app;

public class CompletedGame {

	private String result;
	private Double stake;

	public CompletedGame(String result, Double stake) {
		this.result = result;
		this.stake = stake;
	}

	public double calculateWin(String bet, double gamblerStake) {
		if (bet.equals(result)) {
			return gamblerStake * stake; 
		}
		return 0;
	}

}
