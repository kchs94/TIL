package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.MyFirstStream2;

import java.util.stream.IntStream;
import java.util.Arrays;

public class MyFirstStream2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr)    // 스트림 생성
                .filter(n -> n%2 == 1)  // 중간 연산
                .sum();    // 최종 연산
        System.out.println(sum);
    }
}
