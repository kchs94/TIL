package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법.BoundBox;

class Box<T extends Number>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

public class BoundBox {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();    // Integer는 Number를 상속
        iBox.set(24);      // 오토 박싱
        
        Box<Double> dBox = new Box<>();     // Double은 Number를 상속
        dBox.set(5.97);     // 오토 박싱
        
        System.out.println(iBox.get()); // 오토 언박싱
        System.out.println(dBox.get()); // 오토 언박싱
    }
}
