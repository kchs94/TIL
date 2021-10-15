package IT도서.열혈자바프로그래밍.챕터31_시각과날짜의처리.LocalTimeDemo1;

import java.time.LocalTime;

public class LocalTimeDemo1 {
    public static void main(String[] args) {
        // 현재 시각
        LocalTime now = LocalTime.now();
        System.out.println("현재 시각: " + now);

        // 2시간 10분 뒤 화상 미팅 예정
        LocalTime meeting = now.plusHours(2);
        meeting.plusMinutes(10);

        // 화상 미팅 시각
        System.out.println("화상 미팅 시각: " + meeting);
    }
}
