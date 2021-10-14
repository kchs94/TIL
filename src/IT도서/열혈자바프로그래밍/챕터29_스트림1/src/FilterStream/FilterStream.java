package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.FilterStream;

import java.util.List;
import java.util.Arrays;

public class FilterStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};    // 기본 자료형

        Arrays.stream(arr)
                .filter(n -> n%2 == 1)
                .forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        List<String> list = Arrays.asList("Toy", "Robot", "Box");   // 컬렉션 인스턴스
        list.stream()
                .filter(s -> s.length() == 3)
                .forEach( s-> System.out.print(s + "\t"));
        System.out.println();
    }
}
