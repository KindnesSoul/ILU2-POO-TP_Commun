package model;

public class ReservationSpectacle extends Reservation {
	private int numChaise;
	private int numZone;
	public ReservationSpectacle(int jour, int mois,int numChaise, int numZone) {
		super(jour, mois);
		this.numZone=numZone;
		this.numChaise=numChaise;
	}
	

}
