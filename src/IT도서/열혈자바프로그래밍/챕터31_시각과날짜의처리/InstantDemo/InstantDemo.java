package IT도서.열혈자바프로그래밍.챕터31_시각과날짜의처리.InstantDemo;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println("시작: " + start.getEpochSecond());

        System.out.println("시간은 화살처럼 흘러간다.");

        Instant end = Instant.now();
        System.out.println("끝: " + end.getEpochSecond());

        Duration between = Duration.between(start, end);    // 두 시각의 차 계산
        System.out.println("밀리 초 단위 차: " + between.toMillis());
    }
}
