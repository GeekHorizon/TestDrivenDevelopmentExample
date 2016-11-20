package org.geekhorizon.example.money;

public class Sum implements Expression {

	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}
	public Expression augend;
	public Expression addend;
	
	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return	new Money(amount, to); 
	}

	@Override
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	@Override
	public Expression times(int multiplier) {
		return new Sum(augend.times(multiplier), addend.times(multiplier));
	}

}
