package lang_.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");  //x001
        String str2 = new String("hello");  //x002

        System.out.println("new String() == 비교" +(str1== str2));
        System.out.println("new String() equals 비교: "+(str1.equals(str2)));

        String str3 = "hello";  //문자열 리터럴을 사용하는 경우 효율을 위해 문자열 풀을 사용한다

        String str4 = "hello";  //"hello"문자열 풀을 참조한다

        System.out.println("리터럴 == 비교: "+(str3 == str4));   //같은 문자열 풀을 참조하기 때문에 동일성 비교에 true가 반환된다.
        System.out.println("리터럴 equals 비교: "+ (str3.equals(str4)));

    }



}
