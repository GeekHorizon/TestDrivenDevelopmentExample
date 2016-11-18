package org.geekhorizon.example.money;

public class Doller {

	public int amount;
	
	public Doller(int amount) {
		this.amount = amount;
	}

	public void times(int multiplier) {
		amount *= multiplier;
	}

}
