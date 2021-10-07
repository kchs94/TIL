package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.OneParamNoReturn;

interface Printable {
    void print(String message); // 인터페이스 안에 추상메소드 1개만 존재.
}

public class OneParamNoReturn {
    public static void main(String[] args) {
        Printable printable;

        printable = (String message) -> { System.out.println(message);};    // 줄임표현이 없는 람다식
        printable.print("줄임 표현이 없는 람다식");

        printable = (String message) -> System.out.println(message);        // 한 문장이라서 중괄호를 생략할 수 있는 람다식
        printable.print("중괄호를 생략한 람다식");

        printable = (message) -> System.out.println(message);       // 매개변수 형을 생략한 람다식
        printable.print("매개변수 형을 생략한 람다식");

        printable = message -> System.out.println(message);     // 매개변수가 1개라서 소괄호를 생략한 람다식.
        printable.print("매개변수 소괄호를 생략한 람다식");
    }
}
