package main;

import java.util.logging.Logger;
import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

import model.impl.Compte;
import model.impl.CompteCourant;
import model.exceptions.InsufficientBalance;
import model.dec.*;

//import model.dec.CompteManip;
import model.factory.CompteFactory;


public final class Main{

	private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());
	
	public static void main(String[] args){

		Handler handler = new ConsoleHandler();
		handler.setLevel(Level.FINE);

		CompteFactory cf = new CompteFactory(); /* Singleton version : CompteFactory cf = CompteFactory.getInstance(); */

		CompteManip c1 = cf.createCompteCourant("John Doe");
		CompteManip c2 = cf.createCompteCourant("Jack Bauer");


		/*Compte c1 = new CompteCourant("John Doe", 1500.0d);
		Compte c2 = new CompteCourant("Jack Bauer");*/

		try{
			double retrait = c1.withDraw(1900.0d);
		} catch(InsufficientBalance e){
			LOG.severe(e.getMessage());
		}
		
		double nouveauSolde = c2.deposit(1000000.0d);

		LOG.info(c1.toString());

		System.out.println(c1);
		System.out.println(c2.toString());

	}
}