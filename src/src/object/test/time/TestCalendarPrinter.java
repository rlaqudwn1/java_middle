package object.test.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        System.out.println("Su Mo Tu We Th Fr Sa");
        LocalDate date = LocalDate.of(year, month, 1);
        int weekval = date.getDayOfWeek().getValue() % 7;
        for (int j = 0; j < weekval; j++) {
            System.out.print("  ");
        }
        for (int i = 0; i < date.lengthOfMonth(); i++) {
            date = date.plusDays(1);

            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
        }

    }

}
