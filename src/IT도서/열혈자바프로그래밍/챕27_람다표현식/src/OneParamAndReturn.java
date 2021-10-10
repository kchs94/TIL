package IT도서.열혈자바프로그래밍.챕27_람다표현식.src;

interface HowLong{
    int getLengths(String s);
}

public class OneParamAndReturn {
    public static void main(String[] args) {
        HowLong howLong = s -> s.length();
        System.out.println(howLong.getLengths("Hello world!"));
    }
}
