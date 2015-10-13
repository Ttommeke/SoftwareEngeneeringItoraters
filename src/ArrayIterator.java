import java.util.Iterator;

/**
 * Created by 11302014 on 13/10/2015.
 */
public class ArrayIterator implements Iterator<String> {

    private int pos = 0;
    private String[] array = null;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (pos >= array.length) {
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    public String next() {
        String wop = array[pos];

        pos++;

        return wop;
    }
}
