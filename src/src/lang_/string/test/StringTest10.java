package lang_.string.test;

public class StringTest10 {
    public static void main(String[] args) {

        String str = "Hello Java";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}
