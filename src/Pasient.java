
public class Pasient {
	
	private String navn;
	private String fodselsnummer;
	private int id = 0;
	private Stabel<Resept> resepter;
	
	public Pasient(String navn, String fodselsnummer) {
		this.navn =navn;
		this.fodselsnummer = fodselsnummer;
		this.id ++;
	}
	
	public int getId() {
		return id;
	}
	
	public Stabel<Resept> getStabel(){
		return resepter;
	}
	
	public void leggTilResept(Resept resept) {
		resepter.leggPaa(resept);
	}

}
