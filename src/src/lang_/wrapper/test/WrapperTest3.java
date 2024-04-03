package lang_.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //integer ->int
        int Value = integer1.intValue();
        System.out.println("Value = " + Value);

        //int -> Integer
        Integer integer2 = Integer.valueOf(Value);
        System.out.println("integer2 = " + integer2);
    }
}
