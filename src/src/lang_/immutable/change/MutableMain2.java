package lang_.immutable.change;

public class MutableMain2 {
    public static void main(String[] args) {
        Immutableobj obj = new Immutableobj(10);
        System.out.println("obj = " + obj);
        Immutableobj obj2=obj.add(20); //obj의 value값에서+한 값을 새 인스턴스로 생성하여 대입한다


        System.out.println("obj = " + obj.getValue());
        System.out.println("obj = " + obj);
    }
}
