package IT독서.열혈자바프로그래밍.인터페이스와추상클래스.인터페이스의문법구성과추상클래스_2.인터페이스의디폴트메소드;
/*
* 문제점1: 인터페이스간 상속 --> 인터페이스의 수 2배로 늘어남 --> 관리 어려움
* 문제점2: 디폴트 메소드는 인터페이스에 추상 메소드를 추가해야 하는 상황에서 이전에 개발해 놓은 코드에 영향을 미치지 않기
* 위해 등장한 문법이다. 처음 인터페이스를 설계하는 과정에서 디폴트 메소드를 정의해 넣는다면. 디폴트 메소드를 잘못 사용하고 있는 것이다.
* 해결: 디폴트메소드(Default Methods): default 선언이 붙은 메소드.
* 특징 1. 비록 인터페이스 내에 정의되어 있지만 자체로 완전한 메소드이다
* 특징 2. 따라서 이를 구현하는 클래스가 오버라이딩하지 않아도 된다.
* */

interface Printable {   // 인터페이스
    void print(String doc); // 추상 메소드
    default void printCMYK(String doc){}    // 인터페이스 내 디폴트 메소드
}

class Prn731Drv implements Printable{
    @Override
    public void print(String doc){  // 구현
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

class Prn909Drv implements Printable{
    @Override
    public void print(String doc){
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc){
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}

public class PrinterDriver4 {
    public static void main(String[] args) {
        String myDoc = "This is a report about ...";
        Printable prn1 = new Prn731Drv();
        prn1.print(myDoc);
        System.out.println();

        Printable prn2 = new Prn909Drv();
        prn2.print(myDoc);
    }
}
