package model;

public class FormulaireHotel extends Formulaire {
	private int numLitDouble;
	private int numLitSimple;
	public FormulaireHotel(int numLitDouble, int numLitSimple ,int jour, int mois) {
		super(jour, mois);
		this.numLitDouble=numLitDouble;
		this.numLitSimple=numLitSimple;

	}
	public int getLitDouble() {
		return numLitDouble;
	}
	public int getLitSimple() {
		return numLitSimple;
	}

}
