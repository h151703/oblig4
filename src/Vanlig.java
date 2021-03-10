public class Vanlig extends Legemiddel{

	/**
	 * @param navn
	 * @param pris
	 * @param virkestoff
	 */
	public Vanlig(String navn, int id, int pris, double virkestoff) {
		super(navn, id, pris, virkestoff);
		// TODO Auto-generated constructor stub
	}


	//Metode for å overkjøre toString
	@Override
    public String toString (){
			return "Legemiddel: " + navn + " | Pris: " + hentPris() + " | Id: " + hentId() + " | mg virkestoff: " + hentVirkestoff();

    }
}
