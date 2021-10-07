package IT도서.열혈자바프로그래밍.인터페이스와추상클래스.인터페이스의문법구성과추상클래스_2.인터페이스대상의instanceof연산;
/*
* (ca instanceof Cake): ca가 참조하는 인스턴스가 다음의 조건을 만족할 때 true를 반환한다.
* ca가 참조하는 인스턴스는 Cake를 직접 혹은 간접적으로 구현한 클래스의 인스턴스이다.
*
* */

interface Printable{
    void printLine(String str); // 추상 메소드
}

class SimplePrinter implements Printable{
    public void printLine(String str){
        System.out.println(str);
    }
}

class MultiPrinter extends SimplePrinter{   // Printable을 간접 구현
    public void printLine(String str){
        super.printLine("start of multi...");
        super.printLine(str);
        super.printLine("end of multi");
    }
}

public class InstanceofInterface {
    public static void main(String[] args) {
        Printable prn1 = new SimplePrinter();
        Printable prn2 = new MultiPrinter();

        if(prn1 instanceof Printable)
            prn1.printLine("This is a simple printer.");
        System.out.println();

        if(prn2 instanceof Printable)
            prn2.printLine("This is a multiful printer.");
    }
}
