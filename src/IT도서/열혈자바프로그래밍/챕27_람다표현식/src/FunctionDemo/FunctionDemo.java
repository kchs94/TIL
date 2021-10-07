package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.FunctionDemo;

// Function 제네릭 함수형 인터페이스: 전달인자와 반환값이 있는 추상 메소드(R apply(T t))를 가진다.
// 흔히 사용하는 인터페이스 이다.
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();  // 반환값
        System.out.println(f.apply("Robot"));
        System.out.println(f.apply("System"));
    }
}
