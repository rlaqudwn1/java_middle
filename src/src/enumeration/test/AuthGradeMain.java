package enumeration.test;

public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("설명 = " + value.name());
            System.out.println("level= " + value.getLevel());
            System.out.println("description = " + value.getDescription());

        }
    }
}
