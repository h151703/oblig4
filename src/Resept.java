public abstract class Resept {

	protected int id;
	protected Legemiddel legemiddel;
	protected Lege utskrivendeLege;
	protected int pris;
	protected Pasient pasient;
	protected int reit;



	public Resept(int id, int pris, Legemiddel legemiddel, Lege utskrivendeLege,  Pasient pasient, int reit) {
		this.id = id;
		this.pris = pris;
		this.legemiddel = legemiddel;
		this.utskrivendeLege = utskrivendeLege;
		this.pasient = pasient;
		this.reit = reit;
	}



	public int hentId() {
		return id;
	}



	public Legemiddel hentLegemiddel() {
		return legemiddel;
	}



	public Lege hentUtskrivendeLege() {
		return utskrivendeLege;
	}



	public int hentPasientId() {
		return pasient.getId();
	}



	public int hentReit() {
		return reit;
	}


	/*
	 * Forsøker å bruke resepten en gang.
	 * Return false dersom den er oppbrukt.
	 */
	public boolean bruk() {

		if(reit > 0) {
			reit--;

			return true;
		}

		return false;

	}


    /*
     * Metoder som spesifiseres i subklassene
     */
    public abstract String farge ();
    public abstract double prisAaBetale ();
		public abstract String toString ();







}
