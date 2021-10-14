package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.MyFirstStream;

import java.util.stream.IntStream;
import java.util.Arrays;

public class MyFirstStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arr); // 배열 arr를 입력받아 스트림 생성.
        IntStream stream2 = stream1.filter(n -> n%2 == 1);  // 중간 연산 진행
        int sum = stream2.sum();    // 최종 연산 진행.
        System.out.println(sum);
    }
}
