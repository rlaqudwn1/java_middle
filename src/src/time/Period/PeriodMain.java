package time.Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {

        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate currenDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currenDate.plus(period);   //period의 10일 추가
        System.out.println("currenDate = " + currenDate);
        System.out.println("plusDate = " + plusDate);

        //기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);   //3개월 1일차의 기간 생성
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between);

        System.out.println("기간:  = " + between.getMonths() + "개월 " + between.getDays()+"일");
    }
    
}
