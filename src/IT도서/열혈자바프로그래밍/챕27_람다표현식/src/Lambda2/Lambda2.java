package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.Lambda2;

interface Printable{
    void print(String message);
}

public class Lambda2 {
    public static void main(String[] args) {
        Printable printable = new Printable(){  // 익명 클래스 인스턴스 생성
            public void print(String message){  // 익명 클래스 정의
                System.out.println(message);
            }
        };

        printable.print("안녕하세요!!!");
    }
}
