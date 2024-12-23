package generic.ex4;

public class GenericMethod<T>{

    public static Object objectMethod(Object obj){
        System.out.println("Object print: " + obj);
        return obj;
    }
    public static <T> T numberMethod(T t){
        System.out.println("Object print: " + t);
        return t;
    }
    public static <T extends Number> T numberMethod(T t){
        System.out.println("Object print: " + t);
        return t;
    }

}
