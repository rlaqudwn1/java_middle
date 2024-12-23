package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍뭉미", 100);
        Cat cat = new Cat("고먐미", 50);


       ComplexBox<Dog> hospital = new ComplexBox<>();
       hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);

        //제네릭 타입보다 메서드가 우선순위를 가지게 된다.


    }
}
