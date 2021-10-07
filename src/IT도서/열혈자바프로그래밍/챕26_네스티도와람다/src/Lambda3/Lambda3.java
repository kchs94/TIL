package IT도서.열혈자바프로그래밍.챕26_네스티도와람다.src.Lambda3;

interface Printable {   // 추상 메소드가 하나인 인터페이스
    void print(String s);
}

public class Lambda3 {
    public static void main(String[] args) {
        Printable prn = (s) -> {System.out.println(s);};
        prn.print("람다가 뭐에요?");
    }
}
