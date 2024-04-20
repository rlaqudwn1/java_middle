package object.test.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024,01,01);
        for (int i = 0; i < 5; i++) {
            System.out.println("날짜 "+(i+1)+":"+localDate);
            localDate = localDate.plus(2,ChronoUnit.WEEKS);

        }
    }
}
