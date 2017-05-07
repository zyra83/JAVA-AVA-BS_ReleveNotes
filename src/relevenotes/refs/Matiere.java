package relevenotes.refs;

public enum Matiere {

	JAVA(7), UML(6), SQL(4);

	private final int coef;

	Matiere(int coef) {
		this.coef = coef;
	}

	public int getCoef() {
		return coef;
	}
	
	@Override
	public String toString() {
		return "" + "";
	}

}
