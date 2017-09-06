package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			// TODO: Make sure value of roll is between 1 and 12.
			assertTrue("the die is less than 13", r.getScore() < 13);
			assertTrue("the die is greater than 0", r.getScore() > 0);
			System.out.println("val " + r.getScore());
		}

	}

}
