class Stabel <T> extends Lenkeliste<T> {

    public void leggPaa (T x) {
        leggTil(stoerrelse(), x);
    }

    public T taAv() {
        return fjern(stoerrelse()-1);
    }
}
