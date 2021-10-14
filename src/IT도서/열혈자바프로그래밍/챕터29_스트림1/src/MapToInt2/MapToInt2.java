package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.MapToInt2;

import java.util.List;
import java.util.Arrays;

public class MapToInt2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Robot", "Simple");

        list.stream()
                .mapToInt(s -> s.length())
                .forEach(n -> System.out.print(n + "\t"));
        System.out.println();
    }
}
