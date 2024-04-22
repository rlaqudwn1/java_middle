package generic.collection.ex;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> v = new HashMap<String, String>();
        v.put("a", "b");
        System.out.println("v.get(\"a\") = " + v.get("a"));


    }
}