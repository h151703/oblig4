public class TestLegemiddel {

	  public static void main(String[] args) {

		  Narkotisk narkotisk = new Narkotisk("Knark", 0, 129, 4.1, 10);

		  Vanedannende vanedannende = new Vanedannende("Sobril", 0, 129, 10, 15);

		  Vanlig vanlig = new Vanlig("Zyrtec", 0, 160, 6 );


		 System.out.println(testLegemiddelId(narkotisk, 0));
		 System.out.println(testLegemiddelNavn(vanedannende, "Sobril"));
		 System.out.println(testLegemiddelPris(vanlig, 160));
		 System.out.println(testLegemiddelVirkestoff(narkotisk, 4.1));
		 System.out.println(testNarkotiskStyrke(narkotisk, 10));
		 System.out.println(testVanedannendeStyrke(vanedannende, 15));


	  }


	  public static boolean testLegemiddelId(Legemiddel legemiddel, int forventetLegemiddelId) {
		  return legemiddel.hentId() == forventetLegemiddelId;
	  }

	  public static boolean testLegemiddelNavn(Legemiddel legemiddel, String forventetLegemiddelNavn) {
		  return legemiddel.hentNavn() == forventetLegemiddelNavn;
	  }

	  public static boolean testLegemiddelPris(Legemiddel legemiddel, int forventetLegemiddelPris) {
		  return legemiddel.hentPris() == forventetLegemiddelPris;
	  }

	  public static boolean testLegemiddelVirkestoff(Legemiddel legemiddel, double forventetLegemiddelVirkestoff) {
		  return legemiddel.hentVirkestoff() == forventetLegemiddelVirkestoff;
	  }

	  public static boolean testNarkotiskStyrke(Narkotisk narkotisk, int forventetLegemiddelStyrke) {
		  return narkotisk.hentNarkotiskStyrke() == forventetLegemiddelStyrke;
	  }

	  public static boolean testVanedannendeStyrke(Vanedannende vanedannende, int forventetLegemiddelStyrke) {
		  return vanedannende.hentVanedannendeStyrke() == forventetLegemiddelStyrke;
	  }
}
