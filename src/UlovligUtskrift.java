
public class UlovligUtskrift extends Exception{
    public UlovligUtskrift(Lege lege, Legemiddel legemiddel){
        super("Legen " + lege.hentNavn() + "har ikke lov til � skrive ut " + legemiddel.hentNavn());
    }
}
