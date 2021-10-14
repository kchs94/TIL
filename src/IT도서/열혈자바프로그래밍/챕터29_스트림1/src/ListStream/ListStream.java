package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.ListStream;

import java.util.List;
import java.util.Arrays;

public class ListStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Robot", "Box");
        list.stream()
                .forEach(s -> System.out.print(s + "\t"));
        System.out.println();
    }
}
