package model;

public class ReservationRestaurant extends Reservation {
	private int numTable; 
	private int numService;
	public ReservationRestaurant(int jour, int mois,int numService,int numTable) {
		super(jour, mois);
		this.numService=numService;
		this.numTable=numTable;
	}
	
	public String toString() {
		String jourMois= super.toStringJourMois();
		if (numService==1){return "Le "+jourMois +"\nTable "+numTable+" pour le premier service.";}
		else {return "Le "+jourMois +"\nTable "+numTable+" pour le deuxième service.";}
	}
}