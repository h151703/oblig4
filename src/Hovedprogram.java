public class Hovedprogram {

	public static void main(String[] args) {

		Lege mrLege = new Lege("Linda Larsen");

		Spesialist mrSpes = new Spesialist("Lise Lunde", "9876");
		
		Pasient pasient1 = new Pasient("Pim", "12059523465");

		Narkotisk narkotisk = new Narkotisk("Zopiclone", 10, 129, 4.1, 3);

		Vanedannende vanedannende = new Vanedannende("Valium", 7, 429, 5.2, 15);

		Vanlig vanlig = new Vanlig("Cerazette", 2, 160, 6);

		BlaaResept bla = new BlaaResept(123, 429, vanedannende, mrLege, pasient1, 4);

		HvitResept hvit = new HvitResept(456, 129, narkotisk, mrSpes, pasient1, 1);

		Militaerresept milrep = new Militaerresept(3, 429, vanlig, mrLege, pasient1, 6);

		PResept prep = new PResept(8, 160, vanlig, mrLege, pasient1);


		System.out.println("Lege 1 navn: " + mrLege.hentNavn());
		System.out.println("Lege 2 navn: " + mrSpes.hentNavn() + " Kontrollid: " + mrSpes.toString());

		
		try {
			mrLege.skrivBlaaResept(narkotisk, pasient1, 1);
		}
		catch(UlovligUtskrift u) {
			System.out.print(u);
		}

		skrivUtLegemiddel(vanlig);
		skrivUtLegemiddel(vanedannende);
		skrivUtLegemiddel(narkotisk);
		skrivUtResept(bla);
		skrivUtResept(hvit);
		skrivUtResept(milrep);
		skrivUtResept(prep);
		
		
		

	}


	public static void skrivUtLegemiddel(Legemiddel legemiddel) {
	System.out.println(legemiddel.toString());
	}

	public static void skrivUtResept(Resept resept) {
		System.out.println(resept.toString());
	}

}
