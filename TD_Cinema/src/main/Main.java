package main;

import model.impl.SalleCinema;

public class Main{

	public static void main(String[] args){
		
		SalleCinema cine = new SalleCinema();
		SalleCinema cine2 = new SalleCinema("Star Wars",1000,8.00d);

		SalleCinema cine3 = new SalleCinema(cine2);

		System.out.println(cine.toString());
		System.out.println(cine2.toString());
		System.out.println(cine3.toString());

		for(int i=0;i<300;i++){
			cine.vendrePlace();
			cine2.vendrePlace();
			cine3.vendrePlace();
		}
		

		System.out.println(cine.toString());
		System.out.println(cine2.toString());
		System.out.println(cine3.toString());

		System.out.println(cine2.getnbPlacesVendues());
		System.out.println(cine2.nbPlaces);
		System.out.println(cine2.tauxRemplissage());

	}

}

