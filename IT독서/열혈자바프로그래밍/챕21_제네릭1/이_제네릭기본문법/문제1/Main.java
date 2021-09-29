package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법.문제1;

public class Main {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();  // 인스턴스 생성
        box1.set("Apple", 25);  // set
        
        DBox<String, Integer> box2 = new DBox<>();  // 인스턴스 생성
        box2.set("Orange", 33); // set

        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();  // 인스턴스 생성
        ddbox.set(box1, box2);
        System.out.println(ddbox);  //ddbox.toString() 호출
    }
}
