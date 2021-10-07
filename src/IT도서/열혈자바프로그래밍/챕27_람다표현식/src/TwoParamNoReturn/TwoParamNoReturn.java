package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.TwoParamNoReturn;

interface Calculate {
    void calculate(int a, int b);   // 매개변수가 2개이고 반환형이 없는 람다식
}

public class TwoParamNoReturn {
    public static void main(String[] args) {
        Calculate calculate;

        calculate = (a, b) -> System.out.println(a + b);
        calculate.calculate(4, 3);  // 덧셈 진행
        
        calculate = (a, b) -> System.out.println(a - b);
        calculate.calculate(4,3);   // 뺄셈 진행
        
        calculate = (a, b) -> System.out.println(a * b);
        calculate.calculate(4,3);   // 곱셈 진행
        
        calculate = (a, b) -> System.out.println(a / b);
        calculate.calculate(4, 3);  // 나눗셈 진행
    }
}
