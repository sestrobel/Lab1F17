package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			// TODO: Make sure value of die is between 1 and 6.
			assertTrue("the die is less than 7", d.getDieValue() < 7);
			assertTrue("the die is greater than 0", d.getDieValue() > 0);
			System.out.println("val " + d.getDieValue());
		}

	}

}
