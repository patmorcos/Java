package model.impl;

import java.lang.StringBuilder;

/**
*
* Salle de cinéma
*/

public class SalleCinema{
	private String film;
	public int nbPlaces;
	private double tarif;
	private int nbPlacesVendues;

	public SalleCinema(){
		this.film="Film";
		this.nbPlaces=300;
		this.tarif=8.00d;
		this.nbPlacesVendues=0;
	}

	public SalleCinema(String film, int nbPlaces, double tarif){
		this.film=film;
		this.nbPlaces=nbPlaces;
		this.tarif=tarif;
	}

	public SalleCinema(SalleCinema sc){
		this.film=sc.film;
		this.nbPlaces=sc.nbPlaces;
		this.tarif=sc.tarif;
		this.nbPlacesVendues=sc.nbPlacesVendues;
	}

	public String getFilm(){
		return this.film;
	}

 	public double getTarif(){
 		return this.tarif;
 	}

 	public int getnbPlacesVendues(){
 		return this.nbPlacesVendues;
 	}


 	public void setFilm(String film){
 		this.film=film;
 	}

 	public void setTarif(double tarif){
 		this.tarif=tarif;
 	}

 	public void setNbPlacesVendues(int nbPlacesVendues){
 		this.nbPlacesVendues=nbPlacesVendues;
 	}

 	public void vendrePlace(){
 		this.nbPlacesVendues++;
 	}

 	public int nbPlacesDispo(){
 		return this.nbPlaces - this.nbPlacesVendues;
 	}

 	public boolean estPleine(){
 		if(nbPlacesDispo() == 0){
 			return true;
 		} return false;
 	}

 	public double chiffreAffaires(){
 		return this.nbPlacesVendues * this.tarif;
 	}

 	public double tauxRemplissage(){
 			return (this.nbPlacesVendues/(double)this.nbPlaces)*100;
 	}

 	public String toString(){
 		StringBuilder sb = new StringBuilder();
 		sb.append("Film : ").append(this.film).append("\n")
 		.append("Tarif : ").append(this.tarif).append("\n")
 		.append("Nombre de Places : ").append(this.nbPlaces).append("\n")
 		.append("Nombre de places disponibles : ").append(this.nbPlacesDispo()).append("\n")
 		.append("Salle Pleine : ").append(this.estPleine()).append("\n")
 		.append("Taux remplissage : ").append(this.tauxRemplissage()).append(" % \n")
 		.append("Chiffre d'affaires : ").append(this.chiffreAffaires()).append("\n");
 		return sb.toString();
 	}








	
}