package model;


/**
*	Models a check account.
*
*/


public final class CompteEpargne extends Compte{
	public CompteEpargne(String owner,double initialBalance){
		super(owner,initialBalance);
	}

	public CompteEpargne(String owner){
		super(owner);
	}

	@Override
	public double withDraw(double amount){
		double previous = this.getBalance();
		this.setBalance(previous - amount);
		return this.getBalance();
	}

	@Override
	public double deposit(double amount){
		double previous= this.getBalance();
		this.setBalance(previous + amount);
		return this.getBalance();
	}


}