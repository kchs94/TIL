package IT독서.열혈자바프로그래밍.챕22_제너릭2.BoundedWildcardGenericMethod;

class Box<T> {
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

class Toy {
    @Override
    public String toString(){
        return "장난감 입니다.";
    }
}

class Robot {
    @Override
    public String toString(){
        return "로봇입니다.";
    }
}

class BoxHandler {
    // 제네릭 메소드 왜 사용? Type Erasure것 때문에 오버로딩이 인정이 안되므로
    public static <T> void outBox(Box<? extends T> box){    // T 전용 박스에서 T 꺼내기
        T t = box.get();
        System.out.println(t);
    }
    public static <T> void inBox(Box<? super T> box, T n){  // T 전용 박스에 T 넣기
        box.set(n);
    }
}

public class BoundedWildcardGenericMethod {
    public static void main(String[] args) {
        Box<Toy> tBox = new Box<>();    // 장난감 전용 박스 tBox 생성
        BoxHandler.inBox(tBox, new Toy());  // 장난감 전용 박스 tBox에 장난감 넣기
        BoxHandler.outBox(tBox);    // 장난감 전용 박스 tBox에 있는 장난감 꺼내기

        Box<Robot> rBox = new Box<>();  // 로봇 전용 박스 rBox 생성
        BoxHandler.inBox(rBox, new Robot());    // 로봇 전용 박스에 rBox에 로봇 넣기
        BoxHandler.outBox(rBox);    // 로봇 전용 박스 rBox에 있는 로봇 꺼내기
    }
}
