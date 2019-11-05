package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSquare() {
		JUnitTesting ju = new JUnitTesting();
		int nbr = 5;
		//assert - expected, actual
		assertEquals(25, ju.square(nbr));
	}
}
