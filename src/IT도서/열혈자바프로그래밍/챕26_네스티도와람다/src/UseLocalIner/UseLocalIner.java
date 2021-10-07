package IT도서.열혈자바프로그래밍.챕26_네스티도와람다.src.UseLocalIner;

interface Printable {
    void print();
}

class Papers {
    private String con;
    public Papers(String s) {con = s;}  // 생성자

    public Printable getPrinter(){
        class Printer implements Printable{     // 로컬 클래스의 정의
            public void print(){
                System.out.println(con);
            }
        }

        return new Printer();       // 로컬 클래스의 인스턴스 생성 및 반환
    }
}

public class UseLocalIner {
    public static void main(String[] args) {
        Papers p = new Papers("서류 내용: 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}
