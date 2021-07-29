package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법.BoundedGenericMethod;

class Box<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

class BoxFactory{
    public static <T extends Number> Box<T> makeBox(T o){   // 제네릭 메소드
        Box<T> box = new Box<T>();
        box.set(o);

        System.out.println("Boxed data: "  + o.intValue());
        return box;
    }
}

class Unboxer{
    public static <T extends Number> T openBox(Box<T> box){ // 타입 인자를 Number를 상속하는 클래스로 제한합니다.
        System.out.println("Unboxed data: " + box.get().intValue());    // 타입 인자 제한으로 호출 가능
        return box.get();
    }
}

public class BoundedGenericMethod {
    public static void main(String[] args) {
        Box<Integer> sBox = BoxFactory.makeBox(5939);
        int n = Unboxer.openBox(sBox);
        System.out.println("Returned data: " + n);
    }
}
