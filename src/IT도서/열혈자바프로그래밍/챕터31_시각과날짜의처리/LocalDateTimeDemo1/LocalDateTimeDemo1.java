package IT도서.열혈자바프로그래밍.챕터31_시각과날짜의처리.LocalDateTimeDemo1;

import java.time.LocalDateTime;

public class LocalDateTimeDemo1 {
    public static void main(String[] args) {
        // 현재 날짜와 시각
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // 영국 바이어와 22시간 35분 뒤 화상 미팅 예정
        LocalDateTime meeting = dateTime.plusHours(22);
        meeting = meeting.plusMinutes(35);

        // 영국 바이어와 화상 미팅 날짜와 시각
        System.out.println(meeting);
    }
}
