package IT도서.열혈자바프로그래밍.인터페이스와추상클래스.인터페이스의문법구성과추상클래스_2.인터페이스간상속;
/*
* 문제점: 인터페이스에 추상메소드를 추가해야 하는 상황
* 해결: 인터페이스간 상속
* */
// 두 인터페이스 사이에 상속도 extends를 사용한다.
interface Printable{    // 인터페이스
    void print(String doc);
}

interface ColorPrintable extends Printable {    // 인터페이스가 인터페이스 상속: extends 사용
    void printCMYK(String doc); // 추상메소드
}

// S사의 컬러 프린터 드라이버
class Prn909Drv implements ColorPrintable{
    @Override
    public void print(String doc){
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    @Override   // 구현
    public void printCMYK(String doc){
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}

public class PrinterDriver3 {
    public static void main(String[] args) {
        String myDoc = "This is a report about ...";
        ColorPrintable prn = new Prn909Drv();
        prn.print(myDoc);
        System.out.println();
        prn.printCMYK(myDoc);
    }
}
