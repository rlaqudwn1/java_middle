package nested.test;

public class OuterClassMain2 {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass Inner= outerClass2.new InnerClass();
        Inner.hello();
    }
}
