package IT독서.열혈자바프로그래밍.챕21_제네릭1.일_제네릭이해;

class Apple{
    public String toString(){
        return "나는 사과입니다.";
    }
}

class Orange{
    public String toString(){
        return "나는 오렌지입니다.";
    }
}

class Box<T> {
    private T ob;
    
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

public class FruitAndBox2_Generic {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>(); // T를 Apple로 결정
        Box<Orange> oBox = new Box<Orange>();   // T를 Orange로 결정

        aBox.set(new Apple());  // 사과를 상자에 넣습니다.
        oBox.set(new Orange()); // 오렌지를 상자에 넣습니다.

        Apple ap = aBox.get();  // 사과를 꺼내는데 형 변환 하지 않는다.
        Orange og = oBox.get(); // 오렌지를 꺼내는데 형 변환을 하지 않는다.

        System.out.println(ap);
        System.out.println(og);
    }
}
