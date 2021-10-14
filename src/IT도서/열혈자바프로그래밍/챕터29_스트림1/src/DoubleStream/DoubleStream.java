package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.DoubleStream;

import java.util.Arrays;

public class DoubleStream {
    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        Arrays.stream(arr)
                .forEach(d -> System.out.print(d + "\t"));
        System.out.println();

        Arrays.stream(arr, 1, 4)
                .forEach(d -> System.out.print(d + "\t"));
        System.out.println();
    }
}
