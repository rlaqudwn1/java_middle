package lang_.string.test;
// str에 파일의 이름과 확장자가 주어지고 ext에는 확장자가 주어진다
// 파일명과 확장자를 분리해서 출력하라
public class StringTest5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        String filename = str.substring(0,str.indexOf("."));
        String endname = str.substring(str.indexOf("."));
        System.out.println("filename = " + filename);
        System.out.println("extname = " + endname);
    }
}
