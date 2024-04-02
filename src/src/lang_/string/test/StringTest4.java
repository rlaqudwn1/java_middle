package lang_.string.test;
// substring() 을 사용해서 hello 부분과 .txt를 분리해라
public class StringTest4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0,5);             //문자열 0번부터 5번까지를 filename에 저장
        String endname = str.substring(5);      //문자열 5번부터 끝까지를 endname에 저장
        System.out.println("filename = " + filename);     //출력
        System.out.println("endname = " + endname);

    }

}
