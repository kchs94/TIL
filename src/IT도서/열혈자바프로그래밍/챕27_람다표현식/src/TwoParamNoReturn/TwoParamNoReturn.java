package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.TwoParamNoReturn;

@FunctionalInterface
interface Calculate {
    void cal(int a, int b);
}

public class TwoParamNoReturn {
    public static void main(String[] args) {
        Calculate calculator;

        calculator = (a, b) -> System.out.println(a+b);   // 더하기
        calculator.cal(10, 5);

        calculator = (a, b) -> System.out.println(a-b);     // 빼기
        calculator.cal(10, 5);

        calculator = (a, b) -> System.out.println(a*b);     // 곱하기
        calculator.cal(10, 5);

        calculator = (a, b) -> System.out.println(a/b);     // 나누기
        calculator.cal(10, 5);
    }
}
