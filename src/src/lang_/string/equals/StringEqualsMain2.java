package lang_.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: "+isSame(str1,str2));
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: "+ isSame(str3,str4));


    }
    private static boolean isSame(String x, String y){
        //return  x==y;
        return x.equals(y); //다른 개발자와 함께 개발할 경우 String 인스턴스가
                            //new String() 으로 만든 것인지 문자열 리터럴로 만들어진 것인지
                            //알 수 없기 때문에 문자열 비교는 항상 equals()로 동등성 비교를 해야한다.

    }

}
