package IT독서.열혈자바프로그래밍.챕26_네스티도와람다.src.StaticNested;

class Outer {   // 외부 클래스(Outer Class)
    private static int num = 0;

    static class Nested1 {  // Nested1 static Nested Class
        void add(int n){
            num += n;       // 외부 클래스의 static 멤버 변수, 멤버 함수에 접근 가능
                            // 즉 외부클래스의 인스턴스 생성 유무와 관련이 없다.
        }
    }

    static class Nested2 { // Nested2 static Nested Class
        int get(){
            return num;
        }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nested1 = new Outer.Nested1();
        nested1.add(5);

        Outer.Nested2 nested2 = new Outer.Nested2();
        System.out.println(nested2.get());
    }
}
