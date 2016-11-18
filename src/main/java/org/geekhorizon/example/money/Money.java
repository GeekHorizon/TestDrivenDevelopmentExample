package org.geekhorizon.example.money;

public class Money {
	
	protected int amount;
	protected String currency;
	
	@Override
	public boolean equals(Object e) {
		Money d = (Money) e;
		return amount == d.amount && currency().equals(d.currency());
	}

	public String currency() {
		return currency;
	}

	public static Doller doller(int amount) {
		return new Doller(amount, "USD");
	}

	public static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public Money(int amount, String currency) {
		this.amount = amount; 
		this.currency = currency;
	}
	
	public String toString() {
		return amount + "     " + currency;
	}
}
