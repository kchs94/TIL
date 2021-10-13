package IT도서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        list = new ArrayList<>(list);

        Consumer<List<Integer>> consumer = Collections::reverse;    // 메소드 참조
        consumer.accept(list);
        System.out.println(list);
    }
}
