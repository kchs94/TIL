package IT독서.열혈자바프로그래밍.챕27_람다표현식.src.LamdaGeneric;
// 함수형 인터페이스: 추상 메소드를 1개 가진 인터페이스
@FunctionalInterface    // 인퍼테이스가 함수형 인퍼테이스가 아니면 컴파일 오류 발생
interface Calculate <T> {   // 제네릭 기반의 함수형 인터페이스
    T cal(T a, T b);    // 추상메소드
}

public class LambdaGeneric {
    public static void main(String[] args) {
        Calculate<Integer> ci = (a, b) -> a + b;
        System.out.println(ci.cal(4, 3));

        Calculate<Double> cd = (a, b) -> a + b;
        System.out.println(cd.cal(4.32, 3.45));
    }
}
