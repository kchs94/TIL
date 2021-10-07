package IT도서.열혈자바프로그래밍.챕20_기본클래스.StringTokenizer클래스;

import java.util.StringTokenizer;

public class TokenizeString {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");

        while(st1.hasMoreTokens())
            System.out.print(st1.nextToken() + ' ');
        System.out.println();

        StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");

        while(st2.hasMoreTokens())
            System.out.print(st2.nextToken() + ' ');
        System.out.println();
    }
}
