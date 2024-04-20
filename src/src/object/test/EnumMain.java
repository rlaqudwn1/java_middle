package object.test;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        EnumTest[] enumTests = EnumTest.values();
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST,LOGIN,ADMIN]:");

        for (EnumTest enumTest : enumTests) {
            System.out.println("grade=" + enumTest.name() + ", level=" + enumTest.getLevel() + ", 설명=" + enumTest.description);

        }
    }
}
