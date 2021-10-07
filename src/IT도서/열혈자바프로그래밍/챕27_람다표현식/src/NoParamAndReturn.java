package IT도서.열혈자바프로그래밍.챕27_람다표현식.src;

import java.util.Random;

interface Generator {
    int rand(); // 매개변수 없는 메소드
}

public class NoParamAndReturn {
    public static void main(String[] args) {
        Generator gen = () -> { // 람다식
            Random rand = new Random();
            return rand.nextInt(50);
        };

        System.out.println(gen.rand());
    }
}
