package IT도서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box", "Robot");
        ls.forEach(s ->System.out.println(s));  // 람다식 기반
        ls.forEach(System.out::println);    // 메소드 참조 기반.
    }
}
a