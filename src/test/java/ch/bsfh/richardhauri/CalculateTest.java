package ch.bsfh.richardhauri;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	Calculator testee;

	@Test
	public void testAddition3Plus5Equals8IsOk() {
		testee = new Calculator();
		assertTrue(testee.addition(3, 5) == 8);
	}

	@Test
	public void testSubtraction5Minus8EqualsNegative3IsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraction(5, 8) == -3);
	}

}
