package lang_.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        Integer sum = Integer.valueOf(0);
        sum=Integer.parseInt(str1)+Integer.parseInt(str2);  //문자열을 Integer로 바꿔 더한다
        System.out.println("sum = " + sum);

    }
}
