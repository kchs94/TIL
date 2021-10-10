package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.LamdaGeneric;
// 함수형 인터페이스: 추상 메소드를 1개 가진 인터페이스. 메소드가 여러 개 있어도 괜찮음.

@FunctionalInterface
interface Calculable<T>{    // 제네릭 인터페이스
    T calculate(T a, T b);
}

public class LambdaGeneric {
    public static void main(String[] args) {
        Calculable<Integer> calculator = (a, b) -> a+b;
        System.out.println(calculator.calculate(10, 5));

        Calculable<Double> calculatorDouble = (a, b) -> a+b;
        System.out.println(calculatorDouble.calculate(3.14, 4.12));
    }
}
