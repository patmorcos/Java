package model.factory;

import model.dec.CompteManip;
import model.dec.CompteInterface;

import model.impl.*;

public final class CompteFactory{

	public CompteManip createCompteCourant(String owner){

		return new CompteCourant(owner);
	}

}