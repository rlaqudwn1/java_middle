package time.Instat;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstatMain {
    public static void main(String[] args) {
        Instant now = Instant.now();//UYC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt =ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond=later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);

        // Instant는 조금 특별한 시간, 기계 중심, UTC 기준의 시간
        // 글로벌 서비스에서 시간대 정보를 다루기에 용이함.

    }
}
