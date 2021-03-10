public class TestResepter {

	public static void main(String[] args) {


		Vanlig cerazette = new Vanlig("Cerazette", 170, 5, 0);
		Vanlig zyrtec = new Vanlig("Zyrtec", 210, 10, 0);

		Lege mrLege = new Lege("Linda");
		Pasient pasient = new Pasient("Elsa", "09050509876");

		PResept presept = new PResept(2340, 170, cerazette, mrLege, pasient);

		Militaerresept milrep = new Militaerresept(1234, 170, zyrtec, mrLege, pasient, 4);


		System.out.println(testReseptId(presept, 2340));
		System.out.println(testReseptLegemiddel(milrep, zyrtec));
		System.out.println(testReseptLege(milrep, mrLege));
		System.out.println(testReseptPasientId(presept, 12));
		System.out.println(testReseptReit(milrep, 4));
		System.out.println(testBruk(milrep));
		System.out.println(testReseptFarge(milrep, "Hvit"));
		System.out.println(testReseptPris(milrep, 0));


	}

	 public static boolean testReseptId(Resept resept, int forventetReseptId) {
		  return resept.hentId() == forventetReseptId;
	  }

	 public static boolean testReseptLegemiddel(Resept resept, Legemiddel forventetReseptLegemiddel) {
		  return resept.hentLegemiddel() == forventetReseptLegemiddel;
	  }

	 public static boolean testReseptLege(Resept resept, Lege lege) {
		  return resept.hentUtskrivendeLege() == lege;
	  }

	 public static boolean testReseptPasientId(Resept resept, int pasientId) {
		  return resept.hentPasientId() == pasientId;
	  }

	 public static boolean testReseptReit(Resept resept, int reit) {
		  return resept.hentReit() == reit;
	  }

	 // Returnerer true dersom det er flere resepter igjen
	 public static boolean testBruk(Resept resept) {
		  return resept.bruk() == true;
	  }

	 public static boolean testReseptFarge(Resept resept, String farge) {
		  return resept.farge() == farge;
	  }

	 public static boolean testReseptPris(Resept resept, int pris) {
		  return resept.prisAaBetale() == pris;
	  }



}
