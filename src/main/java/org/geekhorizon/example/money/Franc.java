package org.geekhorizon.example.money;

public class Franc {

	private int amount;

	public Franc(int amount) {
		this.amount = amount; 
	}

	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	@Override
	public boolean equals(Object e) {
		Franc d = (Franc) e;
		return amount == d.amount;
	}
}
