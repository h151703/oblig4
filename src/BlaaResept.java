class BlaaResept extends Resept{

	private final int rabattProsent = 75;

	public BlaaResept(int id, int pris, Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
		super(id, pris, legemiddel, utskrivendeLege, pasient, reit);


	}

	@Override
	public String farge() {
		// TODO Auto-generated method stub
		return "Blaa";
	}

	public double prisAaBetale() {
		return  (100- rabattProsent) * pris;
	}


	//Metode for å overkjøre toString
	@Override
    public String toString (){
			return "Resept for : " + hentLegemiddel().hentNavn() + " | Pris aa betale: " + prisAaBetale() + " | Id: " + hentId() + " | Farge : " + farge() + " | Pasient ID : "+ hentPasientId() + " | Antall resepter igjen : "+ hentReit() + " | Utskrivende lege : "+ hentUtskrivendeLege().hentNavn();
    }


}
