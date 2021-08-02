package IT독서.열혈자바프로그래밍.챕22_제너릭2.TargetTypes;
// 타켓 타입(Target Types): T의 유추에 사용된 정보 Box<Integer>를 타켓 타입이라고 합니다.

class Box<T>{   // 제네릭 클래스
    private T ob;
    public void set(T o){ ob = o;}
    public T get(){ return ob;}
}

class EmptyBoxFactory{
    public static <T> Box<T> makeBox(){ // 제네릭 메소드 makeBox
        Box<T> box = new Box<T>();    // 상자 생성
        return box; // 생성한 상자 반환
    }
}

public class TargetTypes {
    public static void main(String[] args) {
        Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
        iBox.set(25);
        System.out.println(iBox.get());
    }
}
