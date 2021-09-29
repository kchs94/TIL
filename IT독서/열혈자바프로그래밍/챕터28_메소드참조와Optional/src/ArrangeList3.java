package IT독서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort{
    public void sort(List<?> lst){  // 인스턴스 메소드
        Collections.reverse(lst);
    }
}
public class ArrangeList3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);
        JustSort js = new JustSort();

        Consumer<List<Integer>> c = e -> js.sort(e);    // 람다식 기반
        c.accept(ls);
        System.out.println(ls);
    }
}
