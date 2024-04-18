package generic.collection;

import java.util.Vector;

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<>();
        v.add(new Point(3, 5));
        v.add(new Point(6, 8));
        v.add(new Point(10, 5));
        v.remove(2);
        System.out.println(v.getClass());
        System.out.println(v.get(1));
    }
}
