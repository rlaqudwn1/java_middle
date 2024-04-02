package lang_.string.test;
//split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
public class StringTest9 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String parts[] = fruits.split(",");
        String joinedStr=String.join("->",parts);
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println("joinedStr = " + joinedStr);


    }
}
