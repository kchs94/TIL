package IT독서.열혈자바프로그래밍.챕22_제너릭2.WildcardUnboxer;

class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }

    @Override
    public String toString(){
        return ob.toString();
    }
}

class Unboxer{
    public static <T> T openBox(Box<T> box){    // 제네릭 메소드
        return box.get();
    }

    // 상자 안의 내용물을 확인하는(출력하는) 기능의 제네릭 메소드
    // 제네릭 메소드를 선정한 이유: Box<Integer>, Box<String>의 인스턴스를 인자로 전달받기 위해
    // 문제점: Box<Object> 불가 이유: Box<Object>와 Box<Integer>,Box<Stirng>은 상속 관계가 아님.
    // 해결책: wildcard
    public static <T> void peekBox(Box<T> box){
        System.out.print(box);
    }
}

public class WildcardUnboxer {
    public static void main(String[] args) {
        Box<String> box = new Box<>();  // 상자를 만들고
        box.set("So Simple String");    // 상자안에 문자열을 넣습니다.
        Unboxer.peekBox(box);   // 상자 안의 내용물을 확인합니다.
    }
}
