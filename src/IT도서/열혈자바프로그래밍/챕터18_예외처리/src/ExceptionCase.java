package IT도서.열혈자바프로그래밍.챕터18_예외처리.src;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.print(e.getMessage());
        }
        System.out.println("hello");
    }
}
