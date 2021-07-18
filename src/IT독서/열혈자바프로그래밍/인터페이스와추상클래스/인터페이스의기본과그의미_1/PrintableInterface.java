package IT독서.열혈자바프로그래밍.인터페이스와추상클래스.인터페이스의기본과그의미_1;
/*
* 인터페이스(Interface): 추상메소드만 담고있는 클래스.
* 특징1. 인터페이스의 형을 대상으로 참조변수 선언이 가능하다.
* 특징2. 인터페이스이 추상 메소드와 이를 구현하는 메소드 사이에 오버라이딩 관계가 성립한다.
* 추상메소드(Abstract Methods): 메소드의 몸체가 비어있는 메소드.
* 구현(Implementation): 클래스가 인터페이스를 상속하는 행위.
* 특징1. 구현할 인터페이스를 명시할 때 키워드 implements를 사용한다.
* 특징2. 한 클래스는 둘 이상의 인터페이스를 동시에 구현할 수 있다.
* 특징3. 상속과 구현은 동시에 가능하다.
* */
interface Printable {   // 인터페이스
    public void print(String doc);  // 추상메소드
}

class Printer implements Printable {    // Printable 인터페이스를 구현하는 Printer 클래스
    @Override
    public void print(String doc){  // 오버라이딩 관계 성립
        System.out.println(doc);
    }
}

public class PrintableInterface {
    public static void main(String[] args) {
        Printable prn = new Printer();  // Printable형 참조변수 선언 가능
        prn.print("Hello Java");
    }
}
