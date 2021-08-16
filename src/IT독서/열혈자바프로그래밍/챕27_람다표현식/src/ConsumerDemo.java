package IT독서.열혈자바프로그래밍.챕27_람다표현식.src;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Pineapple");
        c.accept("Strawberry");
    }
}
