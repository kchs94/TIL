package IT도서.열혈자바프로그래밍.챕27_람다표현식.src;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {
    public static void main(String[] args) {
        ToIntFunction<String> function = str -> str.length();

        System.out.println(function.applyAsInt("Robot"));
        System.out.println(function.applyAsInt("System"));
    }
}
