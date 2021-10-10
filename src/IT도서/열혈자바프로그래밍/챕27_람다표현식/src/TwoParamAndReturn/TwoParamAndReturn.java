package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.TwoParamAndReturn;

@FunctionalInterface
interface Calculable {
    int calculate(int a, int b);
}

public class TwoParamAndReturn {
    public static void main(String[] args) {
        Calculable calculator;

        calculator = (a, b) -> a+b;
        System.out.println(calculator.calculate(10, 5));

        calculator = (a, b) -> a-b;
        System.out.println(calculator.calculate(10, 5));

        calculator = (a, b) -> a*b;
        System.out.println(calculator.calculate(10, 5));

        calculator = (a,b ) -> a/b;
        System.out.println(calculator.calculate(10, 5));
    }
}
