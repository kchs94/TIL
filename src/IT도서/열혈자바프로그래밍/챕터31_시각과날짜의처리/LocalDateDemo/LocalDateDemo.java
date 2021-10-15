package IT도서.열혈자바프로그래밍.챕터31_시각과날짜의처리.LocalDateDemo;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        // 오늘
        LocalDate today = LocalDate.now();
        System.out.println("오늘: " + today);

        // 올 해의 크리스마스
        LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
        System.out.println("크리스마스: " + xmas);

        // 올 해의 크리스마스 이브
        LocalDate eve = xmas.minusDays(1);
        System.out.println("크리스마스 이브: " + eve);
    }
}
