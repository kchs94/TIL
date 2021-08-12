package IT독서.열혈자바프로그래밍.챕26_네스티도와람다.src.StaticNested;

class Outer {   // 외부 클래스
    private static int num = 0;
    static class Nested1 {  // static 네스티드 클래스
        void add(int n) { num += n;}
    }
    static class Nested2 {  // static 네스티드 클래스
        int get(){ return num; }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1();   // 객체 만들기
        nst1.add(5);
        Outer.Nested2 nst2 = new Outer.Nested2();   // 객체 만들기
        System.out.println(nst2.get());
    }
}
