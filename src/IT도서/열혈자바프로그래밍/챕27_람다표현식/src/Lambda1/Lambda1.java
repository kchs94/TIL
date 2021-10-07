package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.Lambda1;

interface Printable {
    void print(String message);
}

class Printer implements Printable{

    @Override
    public void print(String message){
        System.out.println(message);
    }
}

public class Lambda1 {
    public static void main(String[] args) {
        Printable printable = new Printer();

        printable.print("안녕하세요?");
    }
}
