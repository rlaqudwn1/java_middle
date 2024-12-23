package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Animal> animalHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍뭉이1", 100);
        Cat cat = new Cat("고먐미1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1: 개 병원에 고양이 전달 오류 해결
//        dogHospital.set(cat);
        //문제 2: 개 타입 반환
        dogHospital.set(dog);
        Dog bigger = dogHospital.bigger(new Dog("멍뭉이2", 200));
        System.out.println("bigger = " + bigger);

    }
}
