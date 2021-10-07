package IT도서.JAVA객체지향과디자인패턴.src.챕터2.상속과정적메소드;

class A{
    public static void doIt(){
        System.out.println("부모클래스 doIt static 메소드 호출");
    }

    public void doThat(){
        System.out.println("부모클래스 doThat 메소드 호출");
    }
}

class A1 extends A{

    public static void doIt(){
        System.out.println("자식클래스 doIt static 메소드 호출");
    }

    @Override
    public void doThat(){
        System.out.println("자식클래스 doThat 메소드 호출");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A1();
        A1 a1 = new A1();
    }
}
