package org.geekhorizon.example.money;

import static org.junit.Assert.*;

import org.geekhorizon.example.money.Doller;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		
		Doller five = new Doller(5);
		
		Doller product = five.times(2);
		
		assertEquals(10, product.amount);
		
		product = five.times(3);
		
		assertEquals(15, product.amount);
		
	}

	@Test
	public void testEquality() {
		assertTrue(new Doller(10).equals(new Doller(10)));
		assertFalse(new Doller(6).equals(new Doller(5)));
	}
}
