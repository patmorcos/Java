package model.impl;

import model.dec.CompteManip;
import java.util.logging.Logger;
import model.exceptions.InsufficientBalance;


/**
*	Models a check account.
*
*/


public final class CompteCourant extends Compte implements CompteManip{

	private static final Logger LOG=Logger.getLogger(CompteCourant.class.getCanonicalName());

	private double plafond;
	private final double taux=8.00d;

	public CompteCourant(String owner, double initialBalance, double plafond ){
		super(owner,initialBalance);

		this.plafond=plafond;
	}

	public CompteCourant(String owner){
		super(owner);
		this.plafond = -100.0d;
	}

	public double getPlafond(){
		return this.plafond;
	}

	public void setPlafond(double plafond){
		this.plafond=plafond;
	}

	public boolean isPlafondReached(){
		if(this.getBalance()<this.plafond){
			return true;
		} else return false;
	}	

	@Override
	public double withDraw(double amount) throws InsufficientBalance{
		double previous = this.getBalance();

		try{
			if(previous - amount < 0.0d)
				throw new InsufficientBalance("Overdraft. Current balance = " + previous);
		} catch(InsufficientBalance e){
			LOG.severe("Overdraft of " + amount + " on account with balance" + previous);
		}

		if (previous==this.plafond) {
			System.out.println("Plafond atteint, vous ne pouvez pas retirer !");
			return previous;
		} else {
			this.setBalance(previous - amount);
			return this.getBalance();
		}
	}

	@Override
	public double deposit(double amount){
		double previous= this.getBalance();
		this.setBalance(previous + amount);
		return this.getBalance();
	}




}