package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.numberMethod(i);

        // 타입 인자(Type Argument)
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>numberMethod(i);
        Double v = GenericMethod.<Double>numberMethod(20.0);

    }
}
