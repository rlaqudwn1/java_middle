package object.test.nested;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello(){

            @Override
            public void hello() {
                System.out.println("hello.hello");
            }
        };
        hello.hello();
    }

}
