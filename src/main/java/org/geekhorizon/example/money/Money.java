package org.geekhorizon.example.money;

public class Money implements Expression {
	
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

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	public Money(int amount, String currency) {
		this.amount = amount; 
		this.currency = currency;
	}
	
	public String toString() {
		return amount + "     " + currency;
	}
	
	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	
	@Override
	public Money reduce(Bank bank, String to) {
		return new Money(amount / bank.rate(currency, to), to);
	}
}
