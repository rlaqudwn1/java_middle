package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        //날짜와 시간 조회하기 Chrono Field
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR= " + dt.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY OF MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOURS = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTES = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue());
        System.out.println("DAY OF MONTH = " + dt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = " + dt.getDayOfMonth());
        System.out.println("MINUTE_OF_HOURS = " + dt.getMinute());
        System.out.println("SECOND_OF_MINUTES = " + dt.getSecond());

        System.out.println("편의 메서드 없음");
        System.out.println("MINUTE_OF_DAY = "+dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = "+dt.get(ChronoField.SECOND_OF_DAY));

    }
}

