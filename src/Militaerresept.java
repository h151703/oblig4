public class Militaerresept extends HvitResept {


	private final int rabattProsent = 100;

	public Militaerresept(int id, int pris, Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
		super(id, pris, legemiddel, utskrivendeLege, pasient, reit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double prisAaBetale() {
		return 0;
	}

	//Metode for å overkjøre toString
	@Override
    public String toString (){
      return  "Resept for : " + hentLegemiddel().hentNavn() + " | Pris aa betale: " + prisAaBetale() + " | Id: " + hentId() + " | Farge : " + farge() + " | Pasient ID : "+ hentPasientId() + " | Antall resepter igjen : "+ hentReit() + " | Utskrivende lege : "+ hentUtskrivendeLege().hentNavn();
    }

}
