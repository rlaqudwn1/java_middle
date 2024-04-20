package object.test.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 01, 01);
        LocalTime time = LocalTime.of(9, 00);

        ZonedDateTime seoultime = ZonedDateTime.of(date, time, ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간: "+seoultime);

    }
}
