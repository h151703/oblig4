public class Lege {

	private String navn;


	public Lege(String navn) {
		this.navn = navn;
	}

	public String hentNavn() {
		return navn;
	}


	//Metode for å overkjøre toString
		@Override
	    public String toString (){
	        return navn;
	    }
}
