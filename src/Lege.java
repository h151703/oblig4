public class Lege implements Comparable<Lege> {

	protected String navn;
	protected Lenkeliste<Resept> utskrevedeResepter = new Lenkeliste<>();

	public Lege(String navn) {
		this.navn = navn;
	}

	public String hentNavn() {
		return navn;
	}

	// Method for overriding toString
	@Override
	public String toString() {
		return navn;
	}

	/*
	 * Metode for aa alfabetisere lege etter navn
	 * 
	 * @returns
	 * 
	 * 0 hvis legene har likt navn <0 hvis lege.navn er tidligere i alfabetet enn
	 * navn >0 hvis lege.navn er lengre bak i alfabetet enn navn
	 * 
	 */
	@Override
	public int compareTo(Lege lege) {
		return navn.compareTo(lege.hentNavn());
	}

	/*
	 * Metode for aa hente ut resepter
	 */
	public Lenkeliste<Resept> hentUtskrevedeResepter() {
		return utskrevedeResepter;
	}

	/*
	 * Note: when calling the method, needs to handle the exception with try/catch
	 * 
	 * Metoder for å opprette instans av reseptklassene og legges inn i listen over
	 * legens utskrevene resepter før
	 * 
	 * @returns Resept
	 */

	public HvitResept skrivHvitResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {

		if (legemiddel instanceof Narkotisk) {
			throw new UlovligUtskrift(this, legemiddel);
		}
		// oppretter hvit resept
		HvitResept hvitResept = new HvitResept(legemiddel.hentId(), legemiddel.hentPris(), legemiddel, this, pasient,
				reit);

		// legger til i utskrevne resepter
		utskrevedeResepter.leggTil(hvitResept);

		// returnerer resept
		return hvitResept;

	}

	public Militaerresept skrivMilitaerResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {

		// Sjekker om legemiddelet er av instansen Narkotisk
		if (legemiddel instanceof Narkotisk) {
			throw new UlovligUtskrift(this, legemiddel);
		}

		// oppretter militaer resept
		Militaerresept milResept = new Militaerresept(legemiddel.hentId(), legemiddel.hentPris(), legemiddel, this,
				pasient, reit);

		// legger til i utskrevne resepter
		utskrevedeResepter.leggTil(milResept);

		// returnerer resept
		return milResept;

	}

	public PResept skrivPResept(Legemiddel legemiddel, Pasient pasient) throws UlovligUtskrift {

		// Sjekker om legemiddelet er av instansen Narkotisk
		if (legemiddel instanceof Narkotisk) {
			throw new UlovligUtskrift(this, legemiddel);
		}

		// oppretter P resept
		PResept pResept = new PResept(legemiddel.hentId(), legemiddel.hentPris(), legemiddel, this, pasient);

		// legger til i utskrevne resepter
		utskrevedeResepter.leggTil(pResept);

		// returnerer resept
		return pResept;

	}

	public BlaaResept skrivBlaaResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {

		// Sjekker om legemiddelet er av instansen Narkotisk
		if (legemiddel instanceof Narkotisk) {
			throw new UlovligUtskrift(this, legemiddel);
		}

		// oppretter militaer resept
		BlaaResept blaaResept = new BlaaResept(legemiddel.hentId(), legemiddel.hentPris(), legemiddel, this, pasient,
				reit);

		// legger til i utskrevne resepter
		utskrevedeResepter.leggTil(blaaResept);

		// returnerer resept
		return blaaResept;

	}

}
