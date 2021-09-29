package IT독서.열혈자바프로그래밍.챕27_람다표현식.src.ConsumerDemo;

import java.util.function.Consumer; // Consumer 함수형 인터페이스.
// 특징: 소비하는 형태 즉, 받은 인자를 반환하지 않는 형태. 반환이외에 다른 형태. ex) 출력.

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);    // 람다를 이용한 추상메소드 정의하기.
        c.accept("Pineapple");  // 출력 이라는 결과를 보임.
        c.accept("Strawberry"); //
    }
}
