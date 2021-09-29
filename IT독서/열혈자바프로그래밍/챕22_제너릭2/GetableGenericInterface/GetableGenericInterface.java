package IT독서.열혈자바프로그래밍.챕22_제너릭2.GetableGenericInterface;

interface Getable<T> {  // 제네릭 인터페이스
    public T get();
}

// 인터페이스 Getable<T>를 구현하는 Box<T> 클래스
class Box<T> implements Getable<T>  {
    private T ob;
    public void set(T o){
        ob = o;
    }

    @Override   // 구현
    public T get(){
        return ob;
    }
}

class Toy {
    @Override
    public String toString() {
        return "장난감입니다.";
    }
}

public class GetableGenericInterface {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>(); // Toy 전용 박스 box 생성
        box.set(new Toy());

        // Box<T>가 Getable<T>를 구현하므로 참조 가능
        Getable<Toy> gt = box;
        System.out.println(gt.get());
    }
}
