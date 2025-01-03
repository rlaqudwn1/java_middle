package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍뭉이1", 100);
        Cat cat = new Cat("고먐미1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1: 개 병원에 고양이 전달
//        dogHospital.set(cat); 다른 타입 입력
        Dog bigger = dogHospital.bigger(new Dog("멍뭉이2", 200));
        System.out.println("bigger = " + bigger);
    }
}
