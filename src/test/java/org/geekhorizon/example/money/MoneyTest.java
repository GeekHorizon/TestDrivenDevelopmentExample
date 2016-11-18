package org.geekhorizon.example.money;

import static org.junit.Assert.*;

import org.geekhorizon.example.money.Doller;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Doller five = Money.doller(5);
		assertEquals(Money.doller(10), five.times(2));
		assertEquals(Money.doller(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(Money.doller(10).equals(Money.doller(10)));
		assertFalse(Money.doller(6).equals(Money.doller(5)));
		assertTrue(Money.franc(10).equals(Money.franc(10)));
		assertFalse(Money.franc(6).equals(Money.franc(5)));
		assertFalse(Money.doller(5).equals(Money.franc(5)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test 
	public void testCurrency() {
		assertEquals("USD", Money.doller(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
}
