package IT도서.열혈자바프로그래밍.챕터30_스트림2.src.StreamOfStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfStream {
    public static void main(String[] args) {
        Stream.of(11, 22, 33, 44)
                .forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        Stream.of("So Simple")
                .forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        List<String> list = Arrays.asList("Toy", "Robot", "Box");
        Stream.of(list)
                .forEach(w -> System.out.print(w + "\t"));
        System.out.println();
    }
}
