package IT도서.열혈자바프로그래밍.챕터18_예외처리.src;

import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int n1 = in.nextInt();
            int n2 = in.nextInt();

            System.out.println(n1 / n2);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("예외 처리 후 밑에 문장도 실행된다!!");
    }
}
