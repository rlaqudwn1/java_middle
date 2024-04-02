package lang_.string.test;

public class StringTest7 {
    public static void main(String[] args) {
        String original = " Hello Java ";
        System.out.println(original.trim());

        String input = "hello java spring jpa java";
        input=input.replace("java", "jvm");
        System.out.println("input = " + input);
    }

}
