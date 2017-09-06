package pkgCore;

import java.util.Iterator;
import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore
		Roll roll = new Roll();
		ComeOutScore = roll.getScore();
		rolls.add(roll);
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			eGameResult = eGameResult.CRAPS;
			return;
		}
		if (ComeOutScore == 7 || ComeOutScore == 11) {
			eGameResult = eGameResult.NATURAL;
			return;
		}
		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		while (roll.getScore() != 7 && roll.getScore() != ComeOutScore) {
			roll = new Roll();
			rolls.add(roll);
		}
		
		// TODO: value the eGameResult after the round is complete
		if (roll.getScore() == 7) {
			eGameResult = eGameResult.SEVEN_OUT;
			return;
		}
		
		if (roll.getScore() == ComeOutScore) {
			eGameResult = eGameResult.POINT;
			return;
		}
		
	}

	public int RollCount() {
		// Return the roll count
		int ctr = 0;
		Iterator itr = rolls.iterator();
		while (itr.hasNext()) {
			itr.next();
			ctr++;
		}
		return ctr;
	}
	
	public int getComeOutScore() {
		return ComeOutScore;
	}

	public eGameResult geteGameResult() {
		return eGameResult;
	}
}
