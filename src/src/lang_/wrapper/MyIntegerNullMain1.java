package lang_.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {

        MyInteger[] inArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(2),new MyInteger(3),new MyInteger(1)};
        System.out.println(findValue(inArr, -1));
        System.out.println(findValue(inArr, -0));
        System.out.println(findValue(inArr, 5));
        System.out.println(findValue(inArr, 4));

    }
    private static MyInteger findValue(MyInteger[] intArr, int target){
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue()== target) {
                return myInteger;
            }
        }
        return null;
    }
}
