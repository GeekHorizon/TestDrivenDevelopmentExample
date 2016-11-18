package org.geekhorizon.example.money;

public class Money {
	
	protected int amount;
	
	@Override
	public boolean equals(Object e) {
		Money d = (Money) e;
		return amount == d.amount && this.getClass() == d.getClass();
	}

	public static Doller doller(int amount) {
		return new Doller(amount);
	}

	public static Franc franc(int amount) {
		return new Franc(amount);
	}
	
}
