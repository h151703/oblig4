class SortertLenkeliste <T extends Comparable <T> > extends Lenkeliste<T> {

    //legger til elementer etter str
    @Override
    public void leggTil (T x) {
        if (stoerrelse() == 0) {
            start = new Node (x);
            slutt = start;
            str++;
        }
        else {
            for (int i = 0; i < stoerrelse(); i++) {
                if (hent(i).compareTo(x) > 0) {
                    super.leggTil(i, x);
                    return;
                }
            }
            super.leggTil(stoerrelse(), x);
        }

    }

    //fjerner siste elementet i listen
    @Override
    public T fjern () {
        if (str == 0) {
            throw new UgyldigListeIndeks(-1);
        } else {
            T ting = super.fjern(stoerrelse()-1);
            return ting;
        }
    }

    //overrider sett-metoden slik at den ikke kan brukes pÃ¥ en sortert lenkeliste
    //Overkjorer sett-metoden slik at den ikke brukes på en sortert lenkeliste
    @Override
    public void sett (int pos, T x) {
        throw new UnsupportedOperationException();
    }


    //Overkjorer leggTil-metoden slik at den ikke brukes på en sortert lenkeliste
    @Override
    public void leggTil(int pos, T x) {
        throw new UnsupportedOperationException();
    }
}
