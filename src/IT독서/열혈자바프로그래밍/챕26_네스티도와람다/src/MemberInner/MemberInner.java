package IT독서.열혈자바프로그래밍.챕26_네스티도와람다.src.MemberInner;

class Outer {   // 외부 클래스
    private int num = 0;

    class Member {  // 멤버 클래스
        void add(int n) { num += n;}
        int get() { return num;}
    }
}

public class MemberInner {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer o2 = new Outer();

        // o1 기반으로 두 인스턴스 만들기
        Outer.Member o1m1 = o1.new Member();
        Outer.Member o1m2 = o1.new Member();

        // o2를 이용하여 두 인스턴스 만들기
        Outer.Member o2m1 = o2.new Member();
        Outer.Member o2m2 = o2.new Member();

        // o1 기반으로 생성된 두 인스턴스의 메소드 호출
        o1m1.add(5);
        System.out.println(o1m2.get());

        // o2 기반으로생성된 두 인스턴스의 메소드 호출
        o2m1.add(7);
        System.out.println(o2m2.get());

    }
}
