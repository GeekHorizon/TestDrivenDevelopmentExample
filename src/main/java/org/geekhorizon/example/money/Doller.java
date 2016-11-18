package org.geekhorizon.example.money;

public class Doller {

	private int amount;
	
	public Doller(int amount) {
		this.amount = amount;
	}

	public Doller times(int multiplier) {
		return new Doller(amount * multiplier);
	}
	
	@Override
	public boolean equals(Object e) {
		
		Doller d = (Doller) e;
		
		return amount == d.amount;
	}

}
