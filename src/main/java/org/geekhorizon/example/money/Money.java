package org.geekhorizon.example.money;

public class Money {
	
	protected int amount;
	protected String currency;
	
	@Override
	public boolean equals(Object e) {
		Money d = (Money) e;
		return amount == d.amount && this.getClass() == d.getClass();
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
}
