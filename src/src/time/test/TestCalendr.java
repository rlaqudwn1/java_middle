package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        System.out.println("Su Mo Tu We Th Fr Sa");
        printCalender(year, month);


    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        // 월요일=1(1%7=1).. 일요일
        int offSetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        for (int j = 0; j < offSetWeekDays; j++) {
            System.out.print("   ");
        }
        LocalDate dayByDay= firstDayOfMonth;
        for (int i = 0; i < firstDayOfMonth.lengthOfMonth(); i++) {
            System.out.printf("%2d ", dayByDay.getDayOfMonth());
            if (dayByDay.getDayOfWeek()== DayOfWeek.SATURDAY) {
                System.out.println();

            }

            dayByDay=dayByDay.plusDays(1);

        }
    }

}
