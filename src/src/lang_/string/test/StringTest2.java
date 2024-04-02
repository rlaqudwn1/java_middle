package lang_.string.test;

public class StringTest2 {                      //length() 를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라.
    public static void main(String[] args) {
        int sum = 0;
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ":" + arr[i].length());
            sum += arr[i].length();
            System.out.println("sum = " + sum);
        }
    }
}
