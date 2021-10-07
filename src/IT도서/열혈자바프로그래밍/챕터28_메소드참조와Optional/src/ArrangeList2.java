package IT도서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList2 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);

        Consumer<List<Integer>> c = Collections::reverse;   // 메소드 참조
        c.accept(ls);   // 전달 인자 ls를 reverse에 그래도 전달하게 된다.
        System.out.println(ls);
    }
}
