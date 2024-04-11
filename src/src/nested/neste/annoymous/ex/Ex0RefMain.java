package nested.neste.annoymous.ex;

public class Ex0RefMain {
    public static void helloJava(String str) {
        System.out.println("프로그램 시작"); //변하지 않는 부분
        System.out.println(str); //변하는 부분
        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void helloSpring() {
        System.out.println("프로그램 시작");
        //변하는 부분 시작
        System.out.println("Hello Spring");
        //변하는 부분 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloJava("hello java");
        helloJava("Hello Spring");
    }
}
