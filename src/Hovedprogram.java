public class Hovedprogram {

	public static void main(String[] args) {

		Lege mrLege = new Lege("Linda Larsen");

		Spesialist mrSpes = new Spesialist("Lise Lunde", "9876");

		Narkotisk narkotisk = new Narkotisk("Zopiclone", 10, 129, 4.1, 3);

		Vanedannende vanedannende = new Vanedannende("Valium", 7, 429, 5.2, 15);

		Vanlig vanlig = new Vanlig("Cerazette", 2, 160, 6);

		BlaaResept bla = new BlaaResept(123, 429, vanedannende, mrLege, 1, 4);

		HvitResept hvit = new HvitResept(456, 129, narkotisk, mrSpes, 2, 1);

		Militaerresept milrep = new Militaerresept(3, 429, vanlig, mrLege, 5, 6);

		PResept prep = new PResept(8, 160, vanlig, mrLege, 6);


		System.out.println("Lege 1 navn: " + mrLege.hentNavn());
		System.out.println("Lege 2 navn: " + mrSpes.hentNavn() + " Kontrollid: " + mrSpes.toString());


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
