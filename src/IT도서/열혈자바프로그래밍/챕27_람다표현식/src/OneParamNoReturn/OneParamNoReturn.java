package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.OneParamNoReturn;

interface Printable{
    void print(String s);   // 매개변수 하나, 반환형 void
}

public class OneParamNoReturn {
    public static void main(String[] args) {
        Printable p;
        p = (String s) -> {System.out.println(s);};  // 줄임표현 없는 람다식 표현
        p.print("람다 예시 1");

        p = (String s) -> System.out.println(s);    // 메소드 몸체에 한 문장이니 중괄호 생략 가능.
        p.print("람다 예시 2");

        p = (s) -> System.out.println(s);           // 매개변수 자료형은 인터페이스에 있으므로 삭제 가능.
        p.print("람다 예시 3");

        p = s -> System.out.print(s);               // 매개변수 갯수가 1개 이므로 소괄호 생략 가능.

    }
}
