package IT독서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src;

import java.util.Optional;

public class StringOptional2 {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of(new String("Toy1"));
        Optional<String> os2 = Optional.ofNullable(new String("Toy2"));
        os1.ifPresent(s -> System.out.println(s));  // 람다식 버전
        os1.ifPresent(System.out::println); // 메소드 참조 버전
    }
}
