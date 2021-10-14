package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.MapToInt;

import java.util.List;
import java.util.Arrays;

public class MapToInt {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Robot", "Simple");
        list.stream()   // 컬렉션 인스턴스로 스트림생성
                .map(s -> s.length())   // 중간 연산자
                .forEach(n -> System.out.print(n + "\t"));  // 최종 연산자
        System.out.println();
    }
}
