package IT독서.열혈자바프로그래밍.예외처리.기본;

import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a/b...a?");
        int n1 = in.nextInt();
        System.out.print("a/b...b?");
        int n2 = in.nextInt();
        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        System.out.println("Good bye~~~!");
    }
}
