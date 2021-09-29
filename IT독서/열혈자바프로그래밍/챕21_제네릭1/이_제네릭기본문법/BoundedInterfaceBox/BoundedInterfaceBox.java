package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법.BoundedInterfaceBox;

interface Eatable { // 제네릭 클래스의 타입 인자로 사용될 인터페이스
    public String eat();
}

class Apple implements Eatable {
    public String toString(){
        return "사과입니다";
    }

    @Override
    public String eat(){
        return "맛있어요!";
    }
}

class Box<T extends Eatable> {
    T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        System.out.println(ob.eat());
        return ob;
    }
}

public class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.set(new Apple());   // 사과 저장

        Apple ap = box.get();   // 사과 꺼내기
        System.out.println(ap);
    }
}
