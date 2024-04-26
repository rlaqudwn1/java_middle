package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapexam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "jae");
        map.put("003", "jeda"); // 중복 키값은 설정될 수 없다

        System.out.println("map.size() = " + map.size());

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            System.out.println(map.get(iter.next()));
        }
    }
}
