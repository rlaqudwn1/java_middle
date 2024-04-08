package time;

import java.time.LocalDate;

// LocalDate: 날짜만 표현할 때 사용한다. 년 월 일을 다룬다
// LocalTime: 시간만을 표현할 때 사용한다. 시,분,초를 다룬다.
// LocalDateTime: LocalDate와 LocalTime을 합한 개념이다.
public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();                                  //now() 현재 시간을 기준으로 생성
        LocalDate ofDate = LocalDate.of(2013, 11, 21); //of 특정 날짜를 기준으로 생성
        System.out.println("오늘 날짜"+nowDate);
        System.out.println("지정 날짜="+ofDate);

        //계산(불변)
        ofDate=ofDate.plusDays(10);
        System.out.println("지정 날짜+10d="+ofDate);
    }
}
