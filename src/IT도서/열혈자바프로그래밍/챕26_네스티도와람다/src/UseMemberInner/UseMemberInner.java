package IT도서.열혈자바프로그래밍.챕26_네스티도와람다.src.UseMemberInner;

interface Printable{
    void print();
}

class Papers{
    private String con;
    public Papers(String s){
        con = s;
    }
    public Printable getPrinter(){
        return new Printer();
    }

    private class Printer implements Printable{ // 멤버클래스: 클래스의 정의를 감출 수 있다.
        @Override
        public void print(){
            System.out.print(con);
        }
    }
}

public class UseMemberInner {
    public static void main(String[] args) {
        Papers p = new Papers("서류 내용: 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}
