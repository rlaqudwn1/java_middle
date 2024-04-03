package lang_.class_;

import java.lang.reflect.Field;

public class ClassMeteMain {
    public static void main(String[] args) throws Exception {
        // Class 조회
        Class class_ = String.class; // 1. 클래스에서 조회
//        Class Calss1 = new String().getClass(); //인스턴스에서 조회
//        Class class2 = Class.forName("java lang_ learn");

        // 모든 필드 출력
        Field[] fields = class_.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType()+" "+field.getName());
        }
        //상위 클래스 정보 출력
        System.out.println("Superclass: "+class_.getSuperclass().getName());    //제일 상위인 Object 슈퍼클래스

        //인터페이스 정보 출력
        Class[] interfaces = class_.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("interfaces = " + i.getName());

        }
    }
}
