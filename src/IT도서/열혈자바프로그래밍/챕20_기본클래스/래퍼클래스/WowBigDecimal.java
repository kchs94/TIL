package IT도서.열혈자바프로그래밍.챕20_기본클래스.래퍼클래스;

import java.math.BigDecimal;

public class WowBigDecimal {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("1.6");
        BigDecimal d2 = new BigDecimal("0.1");
        System.out.println("덧셈 결과: " + d1.add(d2));
        System.out.println("곱셈 결과: " + d1.multiply(d2));
    }
}
