public class Spesialist extends Lege implements Godkjenningsfritak {


	private String kontrollID;


	public Spesialist(String navn, String kontrollID) {
		super(navn);
		this.kontrollID = kontrollID;


	}

	//Metode for å overkjøre toString
		@Override
	    public String hentKontrollID (){
	        return kontrollID;
	    }
}
