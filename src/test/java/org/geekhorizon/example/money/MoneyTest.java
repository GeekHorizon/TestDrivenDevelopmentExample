package org.geekhorizon.example.money;

import static org.junit.Assert.*;

import org.geekhorizon.example.money.Doller;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Doller five = new Doller(5);
		assertEquals(new Doller(10), five.times(2));
		assertEquals(new Doller(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(new Doller(10).equals(new Doller(10)));
		assertFalse(new Doller(6).equals(new Doller(5)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
		assertTrue(new Franc(10).equals(new Franc(10)));
		assertFalse(new Franc(6).equals(new Franc(5)));
	}
}
