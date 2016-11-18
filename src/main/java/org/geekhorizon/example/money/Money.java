package org.geekhorizon.example.money;

public class Money {
	
	protected int amount;
	
	@Override
	public boolean equals(Object e) {
		Money d = (Money) e;
		return amount == d.amount;
	}
}
