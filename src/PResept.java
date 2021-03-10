public class PResept extends HvitResept {


	private final int rabatt = 108;

	public PResept(int id, int pris, Legemiddel legemiddel, Lege utskrivendeLege,  Pasient pasient) {
		super(id, pris, legemiddel, utskrivendeLege,  pasient, 3);

	}

	@Override
	public double prisAaBetale() {

		if (pris < rabatt) {
			return 0;
		}
		return pris - rabatt;

	}

	//Metode for å overkjøre toString
	@Override
    public String toString (){
		return 	"Resept for : " + hentLegemiddel().hentNavn() + " | Pris aa betale: " + prisAaBetale() + " | Id: " + hentId() + " | Farge : " + farge() + " | Pasient ID : "+ hentPasientId() + " | Antall resepter igjen : "+ hentReit() + " | Utskrivende lege : "+ hentUtskrivendeLege().hentNavn();

    }
}
