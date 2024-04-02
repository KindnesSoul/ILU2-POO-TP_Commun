package model;

public class ReservationHotel extends Reservation{
	private int numLitSimple; 
	private int numLitDouble;
	private int numEntite;
	public ReservationHotel(int jour, int mois,int numLitDouble,int numLitSimple) {
		super(jour, mois);
		this.numEntite=numEntite;
		this.numLitSimple=numLitSimple;
		this.numLitDouble=numLitDouble;
	}
	
}
