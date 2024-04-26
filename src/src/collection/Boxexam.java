package collection;

public class Boxexam {
    public static void main(String[] args) {
//        Collection collection = new Collection();
//        collection.setObj(new Object());
//        Object obj = collection.getObj();
//
//        collection.setObj("hello");
//        String str =(String)collection.getObj();
//        System.out.println(str);
//
//        collection.setObj(1);
//        int value = (int) collection.getObj();
        Collection<Object> collection = new Collection<>();
        collection.setObj(new Object());
        Object obj = collection.getObj();

        Collection<String> collection1=new Collection<>();
        collection1.setObj("hello");
        String obj1 = collection1.getObj();

        Collection<Integer> collection2 = new Collection<>();
        collection2.setObj(4);
        int v2 = collection2.getObj();


    }
}
