import java.util.Iterator;

public class LenkelisteIterator <T> implements Iterator<T>{

	@Override
	public boolean hasNext() {
		 if (neste != null) {
	            return true;
	        }
	        return false;
	    }

	@Override
	public T next() {
	}

}
