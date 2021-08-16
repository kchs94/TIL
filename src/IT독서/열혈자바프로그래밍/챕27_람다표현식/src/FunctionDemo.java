package IT독서.열혈자바프로그래밍.챕27_람다표현식.src;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Robot"));
        System.out.println(f.apply("System"));
    }
}
