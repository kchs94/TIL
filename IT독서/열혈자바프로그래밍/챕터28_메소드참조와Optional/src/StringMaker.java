package IT독서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src;

import java.util.function.Function;

public class StringMaker {
    public static void main(String[] args) {
        Function<char[], String> f = ar -> {
            return new String(ar);  // 인스턴스를 생성하고 참조 값을 반환해야하는 경우
        };
        char[] src = {'R', 'o', 'b', 'o', 't'};
        String str = f.apply(src);
        System.out.println(str);
    }
}
// Function<T,R> R apply(T t)