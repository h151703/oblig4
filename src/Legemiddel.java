abstract public class Legemiddel {


	protected String navn;
	protected double virkestoff;
	protected int pris;
	protected int id;



	/**
	 * @param navn
	 * @param pris
	 * @param virkestoff
	 */
	public Legemiddel(String navn, int id, int pris, double virkestoff ) {
		this.navn = navn;
		this.id = id;
		this.pris = pris;
		this.virkestoff = virkestoff;

	}

	//e hentId, hentNavn, hentPris og hentVirkestoff
	//settNyPris


	public int hentId() {
		return id;

	}

	public String hentNavn() {
		return navn;
	}

	public int hentPris() {
		return pris;
	}


	public double hentVirkestoff() {
		return virkestoff;
	}



	/*
	 * @param nyPris
	 */

	public void settNyPris(int nyPris) {
		pris = nyPris;

	}


		public abstract String toString();
}
