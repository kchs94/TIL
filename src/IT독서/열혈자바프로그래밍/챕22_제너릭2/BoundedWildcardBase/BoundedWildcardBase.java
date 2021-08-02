package IT독서.열혈자바프로그래밍.챕22_제너릭2.BoundedWildcardBase;

class Box<T> {  // 상장 제네릭 클래스
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

class Toy {     // 장난감 클래스
    @Override       // 오버라이드
    public String toString(){
        return "난 장난감입니다.";
    }
}

class BoxHandler {  // 상자 제어 클래스
    public static void outBox(Box<Toy> box){    // 상자안에 물건 꺼내기
        Toy t = box.get();
        System.out.println(t);
    }
    public static void inBox(Box<Toy> box, Toy n){  // 상자 안에 물거 넣기
        box.set(n); // 상자에 넣기
    }
}

public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>(); // 장난감 전용 상자 생성
        BoxHandler.inBox(box, new Toy());   // 상자에 장난감 넣기
        BoxHandler.outBox(box); // 상자에서 장난감 꺼내기
    }
}
