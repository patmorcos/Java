package model.exceptions;

import java.lang.Exception;

public class InsufficientBalance extends Exception{

	public InsufficientBalance(){
		super();
	}

	public InsufficientBalance(String message){
		super(message);
	}

	


}