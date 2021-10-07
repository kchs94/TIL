package IT도서.열혈자바프로그래밍.인터페이스와추상클래스.인터페이스의문법구성과추상클래스_2.인터페이스의static메소드;

interface Printable{
    static void printLine(String str){
        System.out.println(str);
    }
    default void print(String doc){
        printLine(doc); // 인터페이스의 static 메소드 호출
    }
}

// 인터페이스 Printable에는 구현해야 할 메소드가 존재하지 않는다.
class Printer implements Printable {}

public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is a report aobut ...";
        Printable prn = new Printer();
        prn.print(myDoc);

        //인터페이스의 static 메소드 직접 호출
        Printable.printLine("end of line");
    }
}
