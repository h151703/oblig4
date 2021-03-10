public class Vanedannende extends Legemiddel {

	private int styrke;

	/**
	 * @param navn
	 * @param pris
	 * @param virkestoff
	 * @param styrke
	 */
	public Vanedannende(String navn, int id, int pris, double virkestoff, int styrke) {
		super(navn, id, pris, virkestoff);
		this.styrke = styrke;

	}

	public int hentVanedannendeStyrke() {
		return styrke;
	}

	//Metode for å overkjøre toString
	@Override
		public String toString (){
			return
			"Legemiddel: " + navn +
			" | Pris: " + hentPris() +
			" | Id: " + hentId() +
			" | mg virkestoff: " + hentVirkestoff() +
			" | Styrke: " + hentVanedannendeStyrke();

		}
}
