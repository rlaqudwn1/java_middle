package lang_.string.method;

public class StringComparesionMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java";
        String str2 = "hello, java";
        String str3 = "Hello, World";

        System.out.println("str1 equals str2: "+ str1.equals(str2));
        System.out.println("str1 equalsIsIgnoreCas str2 :" + str1.equalsIgnoreCase(str2));
        System.out.println("'b' compareTo 'a': "+"b".compareTo("a"));
        System.out.println("'b' compareTo 'a': "+"a".compareTo("b"));
        System.out.println("'c' compareTo 'a': "+"c".compareTo("a"));
        System.out.println("str1 compareTO str3: "+str1.compareTo(str3));

        System.out.println("str1 start with Hello: " + str1.startsWith("Hello"));
        System.out.println("str ends with Java!: "+str1.endsWith("Java"));


    }
}
