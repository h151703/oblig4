import java.util.Iterator;

public class Lenkeliste<T> implements Liste<T> {

	protected Node start; // head of the list
	protected Node slutt; // end of the list
	protected int str = 0;

	public Lenkeliste() {

	}

	
	protected class Node {

		T data;
		Node forrige = null;
		Node neste = null;

		// Constructor to create a new node
		public Node(T data_) {
			this.data = data_;
		}

	}
	

	
	//usikker på plasseringen her
	public class LenkelisteIterator <T> implements Iterator<T>{

		//Må hente noden
		Node current = start;
		int teller = 0;
		
		@Override
		public boolean hasNext() {
			 if (current.neste != null) {
		            return true;
		        }
		        return false;
		    }

		@Override
		public T next() {
			T data = current.data;
			current = current.neste;
			teller++;
			return data;
		}

	}

	public Iterator <T> iterator () {
        return new LenkelisteIterator();
    }
	


	/*
	 * Returnerer storrelse på lenkelisten
	 */

	@Override
	public int stoerrelse() {
		return str;
	}

	/*
	 * Legge inn et nytt element i listen. Resterende elementene kommer ett hakk
	 * lenger bak i listen (Får en høyere posisjon)
	 */
	@Override
	public void leggTil(int pos, T x) {

		if (pos > stoerrelse() || pos < 0) {
			throw new UgyldigListeIndeks(pos);
		}

		Node nyNode = new Node(x);

		// checks if th
		if (pos == 0) {
			nyNode.neste = start;
			start = nyNode;

			if (stoerrelse() != 0) {
				start.neste.forrige = nyNode;
			}

			else {
				slutt = start;
			}
		}

		else if (pos == stoerrelse()) {
			nyNode.forrige = slutt;
			slutt.neste = nyNode;
			slutt = nyNode;
		}

		else {
			Node node = start;
			for (int i = 0; i < pos; i++) {
				node = node.neste;
			}

			Node forrige = node.forrige;
			forrige.neste = nyNode;
			nyNode.forrige = forrige;
			nyNode.neste = node;
			node.forrige = nyNode;

		}

		//
		str++;

	}

	// sette inn element på slutten av listen
	@Override
	public void leggTil(T x) {
		Node nyNode = new Node(x);
		Node tidligereSluttNode = slutt;
		slutt = nyNode;

		if (stoerrelse() == 0) {
			start = slutt;
		} else {
			tidligereSluttNode.neste = nyNode;
			nyNode.forrige = tidligereSluttNode;
		}

		str++;

	}

	/*
	 * Sette inn elementet på angitt posisjon overskrive det som var der fra før
	 */
	@Override
	public void sett(int pos, T x) {

		if (stoerrelse() - 1 < pos || pos < 0) {
			throw new UgyldigListeIndeks(pos);
		} else if (stoerrelse() == 0) {
			throw new UgyldigListeIndeks(-1);
		}
		Node n = start;
		for (int i = 0; i < pos; i++) {
			n = n.neste;
		}
		n.data = x;
	}

	/*
	 * Henter ut element uten å fjerne det fra listen på en oppgitt posisjon
	 */
	@Override
	public T hent(int pos) {
		if (pos > stoerrelse() - 1 || pos < 0) {
			throw new UgyldigListeIndeks(pos);
		} else if (stoerrelse() == 0) {
			throw new UgyldigListeIndeks(-1);
		}

		Node n = start;
		for (int i = 0; i < pos; i++) {
			n = n.neste;
		}
		return n.data;
	}

	/*
	 * Fjerne elementet på gitt indeks i listen. De etterfølgende elementene kommer
	 * ett hakk forover i listen (lavere posisjon)
	 */
	@Override
	public T fjern(int pos) {

		if (stoerrelse() - 1 < pos || pos < 0) {
			throw new UgyldigListeIndeks(pos);
		} else if (stoerrelse() == 0) {
			throw new UgyldigListeIndeks(-1);
		}

		Node n = start;
		for (int i = 0; i < pos; i++) {
			n = n.neste;
		}
		if (pos == 0) {
			Node nyStart = n.neste;
			if (nyStart != null) {
				nyStart.forrige = null;
				n.neste = null;
			}
			start = nyStart;
			slutt = start;
			str--;
			return n.data;
		} else if (pos == stoerrelse() - 1) {
			Node nySlutt = n.forrige;
			nySlutt.neste = null;
			n.forrige = null;
			slutt = nySlutt;
			str--;
			return n.data;
		}

		else {
			Node forrige = n.forrige;
			Node neste = n.neste;
			forrige.neste = neste;
			neste.forrige = forrige;
			n.neste = null;
			n.forrige = null;
			str--;
			return n.data;
		}
	}

	// fjerne og returnere elementer på starten av listen
	@Override
	public T fjern() {
		if (stoerrelse() == 0) {
			throw new UgyldigListeIndeks(-1);
		}
		Node tidligereStart = start;
		start = tidligereStart.neste;
		start.forrige = null;
		tidligereStart.neste = null;
		str--;
		return tidligereStart.data;
	}

	public String toString() {
		String string = "";
		return string;
	}

	

}
