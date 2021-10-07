package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.TwoParamAndReturn;

interface Calculate{
    int calculate(int a, int b);  // 값을 반환하는 추상 메소드
}

public class TwoParamAndReturn {
    public static void main(String[] args) {
        Calculate calculator;

        calculator = (a, b) -> { return a+b ;};
        System.out.println( calculator.calculate(3,4));

        calculator = (a, b) -> a*b;
        System.out.println(calculator.calculate(2,5));
    }
}
