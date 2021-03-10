public class HvitResept extends Resept {

	/**
	 * @param id
	 * @param legemiddel
	 * @param lege
	 * @param Pasient
	 * @param reit
	 */
	public HvitResept(int id, int pris, Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
		super(id, pris, legemiddel, utskrivendeLege, pasient, reit);
	}



	@Override
	public String farge() {
		return "Hvit";
	}



	@Override
	public double prisAaBetale() {
		return pris;
	}

	@Override
	public  String toString(){
		return "Resept for : " + hentLegemiddel().hentNavn() + " | Pris aa betale: " + prisAaBetale() + " | Id: " + hentId() + " | Farge : " + farge() + " | Pasient ID : "+ hentPasientId() + " | Antall resepter igjen : "+ hentReit() + " | Utskrivende lege : "+ hentUtskrivendeLege().hentNavn();
	}

}
