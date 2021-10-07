package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.TwoParamNoReturn;

interface Calculate {
    void cal(int a, int b);    // 매개변수 둘, 반환형 void
}

public class TwoParamNoReturn {
    public static void main(String[] args) {
        Calculate c;

        c = (a, b) -> System.out.println(a+b);
        c.cal(4, 3);    // 이번엔 덧셈이 진행

        c = (a, b) -> System.out.println(a-b);
        c.cal(4, 3);

        c = (a, b) -> System.out.println(a*b);
        c.cal(4, 3);
    }
}
