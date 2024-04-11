package nested.test;

public class OuterClassMain {
    public static void main(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.NestedClass nestedClass1 = new OuterClass1.NestedClass();

        nestedClass1.hello();
    }
}
