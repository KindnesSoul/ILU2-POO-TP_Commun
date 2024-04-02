package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	private CalendrierAnnuel date; 
	
	public Reservation(int jour ,int mois) {
			this.jour=jour;
			this.mois=mois;
			
	}
	public String toStringJourMois() {
		return jour+"/"+mois;
	}


	
}