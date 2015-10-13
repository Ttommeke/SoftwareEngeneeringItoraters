import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 11302014 on 13/10/2015.
 */
public class Main {

    public static void main(String[] args) {

        String[] display = getArray();
        ArrayList<String> display2 = new ArrayList<String>();

        Iterator<String> woop = new ArrayIterator(display);

        while (woop.hasNext()) {
            System.out.println(woop.next());
        }

        woop = display2.iterator();

        while (woop.hasNext()) {
            System.out.println(woop.next());
        }
    }

    private static String[] getArray() {

        String[] toReturn = new String[5];

        toReturn[0] = "de EERSTE";
        toReturn[1] = "de TWEEDE";
        toReturn[2] = "de 3de";
        toReturn[3] = "de V-v-v-v-v-4de";
        toReturn[4] = "de wijf... euuuhhhhmmmmm! vijf";

        return toReturn;
    }

    private static ArrayList getArrayList() {

        ArrayList<String> toReturn = new ArrayList<String>();

        toReturn.add("de EERSTE");
        toReturn.add("de TWEEDE");
        toReturn.add("de 3de");
        toReturn.add("de V-v-v-v-v-4de");
        toReturn.add("de wijf... euuuhhhhmmmmm! vijf");

        return toReturn;
    }

}
