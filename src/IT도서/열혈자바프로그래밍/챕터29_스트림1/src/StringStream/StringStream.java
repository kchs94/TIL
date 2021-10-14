package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.StringStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        String[] name = {"KIM", "CHOONG", "SEOP"};
        
        Stream<String> stream = Arrays.stream(name); // 배열로 스트림 생성
        stream.forEach(s -> System.out.println(s)); // 최종 연산 진행.
    }
}
