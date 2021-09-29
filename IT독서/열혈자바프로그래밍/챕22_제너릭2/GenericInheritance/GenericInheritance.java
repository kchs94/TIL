package IT독서.열혈자바프로그래밍.챕22_제너릭2.GenericInheritance;
// 제네릭 클래스와 상속

class Box<T> {  // 제네릭 클래스 Box
    protected T ob; // 멤버 변수
    public void set(T o){   //setter
        ob = o;
    }
    public T get(){ //getter
        return ob;
    }

}

class SteelBox<T> extends Box<T>{   // 제네릭 클래스 Box를 상속하는 제네릭클래스 SteelBox
    public SteelBox(T o){   // 제네릭 클래스의 생성자
        ob = o;
    }
}

public class GenericInheritance {
    public static void main(String[] args) {
        Box<Integer> iBox = new SteelBox<>(7959);   // 제네릭 클래스 Box<T>의 참조변수로 제네릭 클래스 SteelBox<T> 인스턴스를 참조
        Box<String> sBox = new SteelBox<>("Simple");// 제네릭 클래스 Box<T>의 참조변수로 제네릭 클래스 SteelBox<T> 인스턴스를 참조

        System.out.println(iBox.get());
        System.out.println(sBox.get());
    }
}
