package generic.collection.ex;

import java.util.Iterator;
import java.util.Vector;

public class ColletionTest {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(3);
        v.add(2);
        v.add(4);
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            int n= it.next();
            System.out.println("n = " + n);
        }
    }
}
