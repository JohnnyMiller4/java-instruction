package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void countATest() {
		JUnitTesting ju = new JUnitTesting();
		String str = "Apples are Andy's favorite feast! AaaaAaaA!";
		//assert - expected, actual
		assertEquals(13, ju.countA(str));
	}

}
