package IT독서.열혈자바프로그래밍.챕22_제너릭2.UpperBoundedWildcard;

class Box<T>{
    private T ob;
    public void set(T o ){ ob = o;}
    public T get(){ return ob;}

    @Override
    public String toString(){
        return ob.toString();
    }
}

// 와일드카드에 제한을 거는 이유: Box<T>에서 T가 Number또는 Number의 하위 클래스인 제네릭 타입의 인스턴스만을 전달되도록 제한 하고 싶을 때.
class Unboxer {
    public static void peekBox(Box<? extends Number> box){  // 1.box는 Box<T> 인스턴스를 참조하는 참조변수
        System.out.println(box);                            // 2.Box<T> 인스턴스의 T는 Number 또는 이를 상속하는 하위 클래스이다.
    }
}

public class UpperBoundedWildcard {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(1234);
        Box<Double> dBox = new Box<>();
        dBox.set(10.009);

        Unboxer.peekBox(iBox);
        Unboxer.peekBox(dBox);
    }
}
