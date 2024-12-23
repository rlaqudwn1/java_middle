package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍뭉미", 100);
        Cat cat = new Cat("멍뭉미", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog bigDog = new Dog("큰 멍멍이!", 200);
        Dog bigger = AnimalMethod.bigger(bigDog, dog);
        System.out.println("bigger = " + bigger);


    }
}
