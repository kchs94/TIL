package IT도서.열혈자바프로그래밍.챕터31_시각과날짜의처리.LocalTimeDemo2;

import java.time.LocalTime;
import java.time.Duration;

public class LocalTimeDemo2 {
    public static void main(String[] args) {
        // PC방의 PC 이용 시작 시각
        LocalTime start = LocalTime.of(14, 24, 35);
        System.out.println("PC방 이용 시작 시간: " + start);

        // PC방의 PC 이용 종료 시각
        LocalTime end = LocalTime.of(17, 31, 19);
        System.out.println("PC방 이용 종료 시간: " + end);

        // PC방의 PC 이용 시간 계산
        Duration between = Duration.between(start, end);
        System.out.println("총 PC 이용 시간: " + between);
    }
}
