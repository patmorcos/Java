package model.dec;

import model.exceptions.InsufficientBalance;

public interface CompteManip extends CompteInterface{

	double withDraw(double amount) throws InsufficientBalance;

}