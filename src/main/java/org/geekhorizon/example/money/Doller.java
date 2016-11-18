package org.geekhorizon.example.money;

public class Doller extends Money {

	public Doller(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplier) {
		return Money.doller(amount * multiplier);
	}
}
