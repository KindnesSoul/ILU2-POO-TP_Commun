package model;

public class CalendrierAnnuel {
	private Mois[] calendrier =new Mois[12];
	
	public CalendrierAnnuel(){
		calendrier[0]=new Mois("Janvier",31);
		calendrier[1]=new Mois("Fevrier",31);
		calendrier[2]=new Mois("Mars",31);
		calendrier[3]=new Mois("Avril",31);
		calendrier[4]=new Mois("Mai",31);
		calendrier[5]=new Mois("Juin",31);
		calendrier[6]=new Mois("Juillet",31);
		calendrier[7]=new Mois("Aout",31);
		calendrier[8]=new Mois("Septembre",31);
		calendrier[9]=new Mois("Octobre",31);
		calendrier[10]=new Mois("Novembre",31);
		calendrier[11]=new Mois("Decembre",31);
		
	}
	
	public class Mois {
		private String nom;
		private boolean[] jours;
		
		public Mois(String nom,int nbjour) {
			this.nom=nom;
			this.jours= new boolean[nbjour];
			for (int i=0; i<nbjour;i++) {
				jours[i]=false;
			}
		}
		public boolean estLibre(int nbjour) {
			return (!jours[nbjour]);
		}
		public void reserver(int nbjour) {
			if(estLibre(nbjour)) {
				jours[nbjour]=true;
			}
			else { throw new  IllegalStateException("jour déja réserrver");}
			}
	}
	
	public boolean estLibre(int injour, int inmois) {
		if (inmois>12 || inmois<1 ) {throw new IllegalArgumentException("mois compris entre 1 et 12 ");}	
		return (calendrier[inmois-1].estLibre(injour-1));
	}
	
	public boolean reserver(int injour,int inmois) {
		if (inmois>12 || inmois<1 ) {throw new IllegalArgumentException("mois compris entre 1 et 12 ");}	
		if (estLibre(injour,inmois)) {
			calendrier[inmois-1].reserver(injour-1);
			return true;
		}else {
			return false;
		}
		
		
	}
}