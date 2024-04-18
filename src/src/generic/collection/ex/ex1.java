package generic.collection.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class ex1 {

    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>(3);
        for (int i = 0; i <10 ; i++) {
            v.add(i);
        }
        ArrayList<String> a = new ArrayList<>(10);
        a.addLast("Java");
        a.addFirst("C++");
        System.out.println(a.size());
        a.remove(a.getLast());
        System.out.println(a);
    }

}
