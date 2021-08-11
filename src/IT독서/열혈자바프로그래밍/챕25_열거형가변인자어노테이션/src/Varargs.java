package IT독서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;

public class Varargs {
    public static void showAll(String...vargs){     // 매개변수의 가변 인자 선언
        System.out.println("LEN: " + vargs.length);

        for(String s : vargs)
            System.out.print(s + '\t');
        System.out.println();
    }

    public static void main(String[] args) {
        showAll("Box");
        showAll("Box", "Toy");
        showAll("Box", "Toy", "Apple");
    }
}
