package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.Lambda3;

interface Printable {
    void print(String message);
}

public class Lambda3 {
    public static void main(String[] args) {
        Printable printable = (message) -> { System.out.println(message);};

        printable.print("이게바로 람다식이다!");
    }

}
