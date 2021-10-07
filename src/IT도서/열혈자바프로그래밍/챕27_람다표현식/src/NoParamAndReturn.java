package IT도서.열혈자바프로그래밍.챕27_람다표현식.src;

import java.util.Random;

interface Generator {
    int getRandomNum(); // 매개변수 없는 메소드
}

public class NoParamAndReturn {
    public static void main(String[] args) {
        Generator generator = () -> {
            Random random = new Random();
            return random.nextInt(50);
        };

        System.out.println(generator.getRandomNum());
    }
}
