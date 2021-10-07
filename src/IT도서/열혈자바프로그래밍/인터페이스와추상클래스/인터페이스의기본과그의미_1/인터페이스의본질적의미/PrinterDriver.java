package IT도서.열혈자바프로그래밍.인터페이스와추상클래스.인터페이스의기본과그의미_1.인터페이스의본질적의미;
/*
* 인터페이스의 역할: 연결점, 매개체, 접점
* 
* */
interface Printable {
    public void print(String doc);
}

class SPrinterDriver implements Printable{
    @Override
    public void print(String doc){
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}

class LPrinterDriver implements Printable{
    @Override
    public void print(String doc){
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}

public class PrinterDriver {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);
        System.out.println();

        // LG 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);
    }
}
