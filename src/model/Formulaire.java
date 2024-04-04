package model;

public abstract class Formulaire {
		private int jour;
		private int mois;
		private CalendrierAnnuel date;
		private int id;
		
		protected Formulaire(int jour ,int mois) {
				this.jour=jour;
				this.mois=mois;
				
		}
		public int getMois() {
			return mois;
		}
		public int getJour() {
			return jour;
		}
		public void setIdentificationEntite(int identification) {
			this.id=identification;
			
		}

		public Integer getIdentificationEntite() {
			return id;
		}
}