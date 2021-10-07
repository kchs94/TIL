package IT도서.열혈자바프로그래밍.챕26_네스티도와람다.src.Lambda4;

interface Printable{
    void print(String s);
}

public class Lambda4 {
    public static void ShowString(Printable p, String s){
        p.print(s);
    }

    public static void main(String[] args) {
        ShowString((s) -> {System.out.println(s);}, "람다가뭐에요?");
    }
}
