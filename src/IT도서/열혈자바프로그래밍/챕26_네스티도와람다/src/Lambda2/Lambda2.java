package IT도서.열혈자바프로그래밍.챕26_네스티도와람다.src.Lambda2;

interface Printable{
    void print(String s);
}


public class Lambda2 {
    public static void main(String[] args) {
        Printable prn = new Printable(){        // 익명 클래스
            public void print(String s){
                System.out.println(s);
            }
        };

        prn.print("람다가 뭐에요?");
    }
}
