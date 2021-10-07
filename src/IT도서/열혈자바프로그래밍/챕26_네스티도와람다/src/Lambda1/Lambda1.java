package IT도서.열혈자바프로그래밍.챕26_네스티도와람다.src.Lambda1;

interface Printable{
    void print(String s);
}

class Printer implements Printable {
    public void print(String s){
        System.out.println(s);
    }
}

public class Lambda1 {
    public static void main(String[] args) {
        Printable prn = new Printer();
        prn.print("람다가 뭐에요?");
    }
}
