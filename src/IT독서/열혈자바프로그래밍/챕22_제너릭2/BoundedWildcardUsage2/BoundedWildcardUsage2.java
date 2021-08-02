package IT독서.열혈자바프로그래밍.챕22_제너릭2.BoundedWildcardUsage2;

class Box<T>{
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
    public String toString() {
        return "난 장난감 입니다.";
    }
}

class BoxHandler {
    public static void outBox(Box<? extends Toy> box){  // 와일드 카드 제한
        Toy t = box.get();  // 상장에서 장난감 꺼내기
        System.out.println(t);
    }
    public static void inBox(Box<? super Toy> box, Toy n) { // 와일드 카드 제한
        box.set(n);     // 상자에 장난감 넣기
    }
}

public class BoundedWildcardUsage2 {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>(); // 장난감 전용 상자 만들기.
        BoxHandler.inBox(box, new Toy());   // 장난감 전용 상자에 장난감 넣기.
        BoxHandler.outBox(box);     // 장난감 전용 상자에서 장난감 꺼내기.
    }
}
