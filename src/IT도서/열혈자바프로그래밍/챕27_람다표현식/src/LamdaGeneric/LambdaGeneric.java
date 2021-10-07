package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.LamdaGeneric;
// 함수형 인터페이스: 추상 메소드를 1개 가진 인터페이스. 메소드가 여러 개 있어도 괜찮음.

@FunctionalInterface
interface Calculate <T>{
    T calculate(T a, T b);
}

public class LambdaGeneric {
    public static void main(String[] args) {
        Calculate<Integer> calculator = (a, b) -> a+b;
        System.out.println(calculator.calculate(3,5));

        Calculate<Double> doubleCalculate = (a, b) -> a+b;
        System.out.println(doubleCalculate.calculate(3.42, 4.123));
    }
}
