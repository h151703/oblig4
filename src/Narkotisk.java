public class Narkotisk extends Legemiddel {

	private int styrke;


	public Narkotisk(String navn, int id, int pris, double virkestoff, int styrke) {
		super(navn, id, pris, virkestoff);
		this.styrke = styrke;

	}

	public int hentNarkotiskStyrke() {
		return styrke;
	}

	//Metode for å overkjøre toString
	@Override
		public String toString (){
				return "Legemiddel: " + navn + " | Pris: " + hentPris() + " | Id: " + hentId() + " | mg virkestoff: " + hentVirkestoff() + " | Styrke: " + hentNarkotiskStyrke();
		}

}
